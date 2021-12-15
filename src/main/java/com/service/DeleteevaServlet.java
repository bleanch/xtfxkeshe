package com.service;

import com.entity.Evalucation;
import com.mapper.EvalucationMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteeva")
public class DeleteevaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int eid= Integer.parseInt(request.getParameter("eid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        evalucation.delete(eid);
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index?n=5");
    }
}
