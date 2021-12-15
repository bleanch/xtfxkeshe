package com.service;

import com.entity.Evalucation;
import com.mapper.EvalucationMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/findeva")
public class FindevaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int eid= Integer.parseInt(request.getParameter("eid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        Evalucation eva=evalucation.get(eid);
        request.setAttribute("eva",eva);
        sqlSession.close();
        request.getRequestDispatcher("/WEB-INF/geteva.jsp").forward(request,response);
    }
}
