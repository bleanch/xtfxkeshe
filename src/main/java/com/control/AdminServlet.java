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

@WebServlet(value = "/admin")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        List<Admin> adminList=adminMapper.getadmins();
        request.setAttribute("admins",adminList);
        request.getRequestDispatcher("/WEB-INF/admin.jsp").forward(request,response);
        sqlSession.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
