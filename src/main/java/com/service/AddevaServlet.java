package com.service;

import com.entity.Applacation;
import com.entity.Evalucation;
import com.mapper.ApplacationMapper;
import com.mapper.EvalucationMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addeva")
public class AddevaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int eid= Integer.parseInt(request.getParameter("eid"));
        int gid= Integer.parseInt(request.getParameter("gid"));
        int uid= Integer.parseInt(request.getParameter("uid"));
        String content=request.getParameter("content");
        int aid= Integer.parseInt(request.getParameter("aid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        evalucation.add( new Evalucation(eid,gid,uid,content,aid));
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index?n=5");
    }
}
