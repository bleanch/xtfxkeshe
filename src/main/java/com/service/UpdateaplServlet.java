package com.service;

import com.entity.Admin;
import com.entity.Applacation;
import com.mapper.AdminMapper;
import com.mapper.ApplacationMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet("/updateapl")
public class UpdateaplServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int fid= Integer.parseInt(request.getParameter("fid"));
        int gid= Integer.parseInt(request.getParameter("gid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        applacationMapper.update(new Applacation(fid,gid,1));
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index?n=4");
    }
}
