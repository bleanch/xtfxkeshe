package com.entity;

import com.mapper.EvalucationMapper;
import com.mapper.MemberMapper;
import com.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MemberTest extends TestCase {
    @Test
    public void testfind() throws IOException {
        /**
         *  1、获得 SqlSessionFactory
         *  2、获得 SqlSession
         *  3、调用在 mapper 文件中配置的 SQL 语句
         */
        // 获取到 SqlSession
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
        List<Member> memberList=memberMapper.gets();
        for (Member p : memberList){
            System.out.println(p);
        }
        sqlSession.close();
    }
    @Test
    public void testgetadmin()throws IOException{
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
        Member eva=memberMapper.get(1);
        System.out.println(eva);
        sqlSession.close();
    }
    @Test
    public void testadd(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
        int res=memberMapper.add( new Member(3,"aaa",3,"skdjalskjdsald","123456",2));
        if(res>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testupdate(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
        int res=memberMapper.update( new Member(3,"aaa",2,"skdjalskjdsald","123456",2));
        if(res>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testdelete(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        MemberMapper memberMapper=sqlSession.getMapper(MemberMapper.class);
       int res=memberMapper.delete(3);
        if(res>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}