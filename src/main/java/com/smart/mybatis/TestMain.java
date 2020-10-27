package com.smart.mybatis;

import com.smart.mybatis.entity.User;
import com.smart.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain {
    public static void main(String[] args) {
        //工厂模式
        //构建者模式
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //连接————接口
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setUsername("admin");
        user.setPassword("123456");
        int insert=mapper.insert(user);
        System.out.println(insert);

    }
}
