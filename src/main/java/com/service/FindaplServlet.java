package com.service;

import com.entity.Applacation;
import com.mapper.ApplacationMapper;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet( "/findapl")
public class FindaplServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int fid= Integer.parseInt(request.getParameter("fid"));
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        Applacation apl= applacationMapper.get(fid);
        request.setAttribute("apl",apl);
        sqlSession.close();
        request.getRequestDispatcher("/WEB-INF/getapl.jsp").forward(request,response);
    }
}
