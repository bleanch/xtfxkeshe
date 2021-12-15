package com.service;

import com.entity.Member;
import com.mapper.MemberMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/findmem")
public class FindmemServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int mid= Integer.parseInt(request.getParameter("mid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
        Member mem=memberMapper.get(mid);
        request.setAttribute("mem",mem);
        sqlSession.close();
        request.getRequestDispatcher("/WEB-INF/getmem.jsp").forward(request,response);
    }
}
