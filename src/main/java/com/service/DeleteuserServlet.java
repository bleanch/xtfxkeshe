package com.service;

import com.mapper.UserMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet( "/deleteuser")
public class DeleteuserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.delete(id);
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index");
    }
}
