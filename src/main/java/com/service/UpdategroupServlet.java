package com.service;

import com.entity.Group;
import com.mapper.GroupMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updategroup")
public class UpdategroupServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int gid= Integer.parseInt(request.getParameter("gid"));
        int lid= Integer.parseInt(request.getParameter("lid"));
        String name=request.getParameter("name");
        int num= Integer.parseInt(request.getParameter("num"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        groupMapper.update( new Group(gid,lid,name,num));
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index?n=2");
    }
}
