package com.entity;

import com.mapper.EvalucationMapper;
import com.mapper.GroupMapper;
import com.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class GroupTest extends TestCase {
    @Test
    public void testfind() throws IOException {
        /**
         *  1、获得 SqlSessionFactory
         *  2、获得 SqlSession
         *  3、调用在 mapper 文件中配置的 SQL 语句
         */
        // 获取到 SqlSession
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        List<Group> groupList=groupMapper.gets();
        for (Group p : groupList){
            System.out.println(p);
        }
        sqlSession.close();
    }
    @Test
    public void testgetadmin()throws IOException{
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        Group eva=groupMapper.get(1);
        System.out.println(eva);
        sqlSession.close();
    }
    @Test
    public void testadd(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        int res=groupMapper.add( new Group(4,1,"klklk",1));
        if(res>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testupdate(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        int res=groupMapper.update( new Group(4,1,"ggg"));
        if(res>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testdelete(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
        int res=groupMapper.delete(4);
        if(res>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}