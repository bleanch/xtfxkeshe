package com.control;

import com.entity.*;
import com.mapper.*;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet( value = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList=userMapper.gets();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        List<Applacation> applacationList=applacationMapper.gets();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        List<Evalucation> evalucationList=evalucation.gets();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        List<Group> groupList=groupMapper.gets();
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
        List<Member> memberList=memberMapper.gets();
        request.setAttribute("users",userList);
        request.setAttribute("apls",applacationList);
        request.setAttribute("evas",evalucationList);
        request.setAttribute("groups",groupList);
        request.setAttribute("members",memberList);
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
        sqlSession.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
