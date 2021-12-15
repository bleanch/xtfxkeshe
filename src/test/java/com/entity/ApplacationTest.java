package com.entity;

import com.mapper.ApplacationMapper;
import com.mapper.EvalucationMapper;
import com.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ApplacationTest extends TestCase {
    @Test
    public void testfind() throws IOException {
        /**
         *  1、获得 SqlSessionFactory
         *  2、获得 SqlSession
         *  3、调用在 mapper 文件中配置的 SQL 语句
         */
        // 获取到 SqlSession
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        List<Applacation> applacationList=applacationMapper.gets();
        for (Applacation p :applacationList){
            System.out.println(p);
        }
        sqlSession.close();
    }
    @Test
    public void testgetadmin()throws IOException{
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        Applacation apl=applacationMapper.get(1);
        System.out.println(apl);
        sqlSession.close();
    }
    @Test
    public void testadd(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        int res=applacationMapper.add( new Applacation(3,"adsa",3,"hhh",5,0,0,new Date(System.currentTimeMillis())));
        if(res>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testupdate(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        int res=applacationMapper.update(new Applacation(3,2,1));
        if(res>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testdelete(){
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        ApplacationMapper applacationMapper=sqlSession.getMapper(ApplacationMapper.class);
        int res=applacationMapper.delete(3);
        if(res>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}