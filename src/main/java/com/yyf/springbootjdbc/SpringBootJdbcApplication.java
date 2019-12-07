package com.yyf.springbootjdbc;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.yyf.springbootjdbc.mapper") //配置扫描对应mapper的包
@SpringBootApplication
public class SpringBootJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcApplication.class, args);
    }

}
