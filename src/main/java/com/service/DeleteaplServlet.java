package com.service;

import com.entity.Applacation;
import com.mapper.ApplacationMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteapl")
public class DeleteaplServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int fid= Integer.parseInt(request.getParameter("fid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        applacationMapper.delete(fid);
        sqlSession.commit();
        sqlSession.close();
        response.sendRedirect(request.getContextPath()+"/index?n=4");
    }
}
