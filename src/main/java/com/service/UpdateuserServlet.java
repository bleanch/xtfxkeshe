package com.service;

import com.entity.User;
import com.mapper.UserMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateuser")
public class UpdateuserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String acc=request.getParameter("acc");
        String addr=request.getParameter("addr");
        String pwd=request.getParameter("pwd");
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.update( new User(id,name,acc,addr,pwd));
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index");
    }
}
