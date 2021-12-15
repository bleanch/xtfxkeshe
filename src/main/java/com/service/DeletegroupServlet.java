package com.service;

import com.mapper.GroupMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deletegroup")
public class DeletegroupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int gid= Integer.parseInt(request.getParameter("gid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        groupMapper.delete(gid);
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index?n=2");
    }
}
