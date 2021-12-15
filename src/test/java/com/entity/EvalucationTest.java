package com.entity;

import com.mapper.AdminMapper;
import com.mapper.EvalucationMapper;
import com.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EvalucationTest extends TestCase {
    @Test
    public void testfind() throws IOException {
        /**
         *  1、获得 SqlSessionFactory
         *  2、获得 SqlSession
         *  3、调用在 mapper 文件中配置的 SQL 语句
         */
        // 获取到 SqlSession
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        List<Evalucation> evalucationList=evalucation.gets();
        for (Evalucation p : evalucationList){
            System.out.println(p);
        }
        sqlSession.close();
    }
    @Test
    public void testgetadmin()throws IOException{
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        Evalucation eva=evalucation.get(1);
        System.out.println(eva);
        sqlSession.close();
    }
    @Test
    public void testadd(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        int res=evalucation.add( new Evalucation(3,2,1,"bbb",1));
        if(res>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testupdate(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        int res=evalucation.update(new Evalucation(3,1,1,"bbb",1));
        if(res>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testdelete(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        EvalucationMapper evalucation=sqlSession.getMapper(EvalucationMapper.class);
        int res=evalucation.delete(3);
        if(res>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}