package com.entity;

import com.mapper.EvalucationMapper;
import com.mapper.UserMapper;
import com.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class UserTest extends TestCase {
    @Test
    public void testfind() throws IOException {
        /**
         *  1、获得 SqlSessionFactory
         *  2、获得 SqlSession
         *  3、调用在 mapper 文件中配置的 SQL 语句
         */
        // 获取到 SqlSession
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList=userMapper.gets();
        for (User p :userList){
            System.out.println(p);
        }
        sqlSession.close();
    }
    @Test
    public void testgetadmin()throws IOException{
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User eva=userMapper.get(1);
        System.out.println(eva);
        sqlSession.close();
    }
    @Test
    public void testadd(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        int res=userMapper.add( new User(2,"sds","dsdsds","bbb","dsddd"));
        if(res>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testupdate(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        int res=userMapper.update(new User(2,"hhh","dfdfds","bbb","55888"));
        if(res>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testdelete(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        int res=userMapper.delete(2);
        if(res>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}