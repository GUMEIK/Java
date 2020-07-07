package com.gumeik.test;

import com.gumeik.domin.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mybatis {
@Test
    public void test1() throws IOException {
//    获得核心配置文件
    InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfig.xml");

//    获得工厂对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//    获得seession会话对象
    SqlSession sqlSession = sqlSessionFactory.openSession();
//    执行操作  namespace + id
    List<User> userList = sqlSession.selectList("userMapper.findAll");
//    打印数据
    System.out.println(userList);
//    释放资源
    sqlSession.close();

}

}
