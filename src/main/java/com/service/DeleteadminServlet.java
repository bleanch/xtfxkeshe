package com.service;

import com.mapper.AdminMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteadmin")
public class DeleteadminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        adminMapper.deleteadmin(id);
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/admin");
    }
}
