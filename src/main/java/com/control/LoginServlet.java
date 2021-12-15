package com.control;

import com.entity.Admin;
import com.mapper.AdminMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("acc");
        String password=request.getParameter("pwd");
        String url="/login";
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        List<Admin> adminList=adminMapper.getadmins();
        for (Admin p : adminList){
            if(p.getAcc().equals(username)&&p.getPwd().equals(password)){
                request.getSession().setAttribute("admin",p);
                url="/index";
                break;
            }
        }
        response.sendRedirect(request.getContextPath()+url);
        sqlSession.close();
    }
}
