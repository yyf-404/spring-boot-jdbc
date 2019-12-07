package com.yyf.springbootjdbc;

import com.yyf.springbootjdbc.bean.User;
import com.yyf.springbootjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class SpringBootJdbcApplicationTests {
    @Autowired
     DataSource dataSource;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() throws SQLException {
        User user=userMapper.getUserById(1);
        System.out.println(user);
    }

}
