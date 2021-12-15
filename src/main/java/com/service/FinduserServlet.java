package com.service;

import com.entity.User;
import com.mapper.UserMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/finduser")
public class FinduserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.get(id);
        request.setAttribute("user",user);
        sqlSession.close();
        request.getRequestDispatcher("/WEB-INF/getuser.jsp").forward(request,response);
    }
}
