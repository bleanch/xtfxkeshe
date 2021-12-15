package com.service;

import com.entity.Admin;
import com.mapper.AdminMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateadmin")
public class UpdateadminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String acc=request.getParameter("acc");
        String pwd=request.getParameter("pwd");
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        adminMapper.updateadmin(new Admin(id,name,acc,pwd));
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/admin");
    }
}
