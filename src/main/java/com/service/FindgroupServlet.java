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
import java.util.List;

@WebServlet( "/findgroup")
public class FindgroupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int gid= Integer.parseInt(request.getParameter("gid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        Group group= groupMapper.get(gid);
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
        List<Member> mems=memberMapper.getmems(gid);
        request.setAttribute("group",group);
        request.setAttribute("mems",mems);
        sqlSession.close();
        request.getRequestDispatcher("/WEB-INF/getgroup.jsp").forward(request,response);
    }
}
