package com.entity;

import com.mapper.AdminMapper;
import com.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class AdminTest extends TestCase {
    @Test
    public void testfind() throws IOException {
        /**
         *  1、获得 SqlSessionFactory
         *  2、获得 SqlSession
         *  3、调用在 mapper 文件中配置的 SQL 语句
         */
           // 获取到 SqlSession
        SqlSession sqlSession= MybatisUtils.getsqlsession();
        // 调用 mapper 中的方法：命名空间 + id
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        List<Admin> adminList=adminMapper.getadmins();
        for (Admin p : adminList){
            System.out.println(p);
        }
        sqlSession.close();
    }
    @Test
    public void testgetadmin()throws IOException{
        SqlSession sqlSession=MybatisUtils.getsqlsession();
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        Admin admin=adminMapper.getadmin(2);
        System.out.println(admin);
        sqlSession.close();
    }
    @Test
    public void testadd(){
        SqlSession sqlSession=MybatisUtils.getsqlsession();
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        int res=adminMapper.addadmin( new Admin(3,"王五","ccc","123456"));
        if(res>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testupdate(){
        SqlSession sqlSession=MybatisUtils.getsqlsession();
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        int res=adminMapper.updateadmin( new Admin(2,"赵六","ccc","123456"));
        if(res>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testdelete(){
        SqlSession sqlSession=MybatisUtils.getsqlsession();
        AdminMapper adminMapper=sqlSession.getMapper(AdminMapper.class);
        int res=adminMapper.deleteadmin(3);
        if(res>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
