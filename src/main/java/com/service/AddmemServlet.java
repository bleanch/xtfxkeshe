package com.service;

import com.entity.Group;
import com.entity.Member;
import com.mapper.GroupMapper;
import com.mapper.MemberMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addmem")
public class AddmemServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int mid= Integer.parseInt(request.getParameter("mid"));
        int gid= Integer.parseInt(request.getParameter("gid"));
        String name=request.getParameter("name");
        String acc=request.getParameter("acc");
        String pwd=request.getParameter("pwd");
        int duty= Integer.parseInt(request.getParameter("duty"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
        memberMapper.add( new Member(mid,name,gid,acc,pwd,duty));
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index?n=3");
    }
}
