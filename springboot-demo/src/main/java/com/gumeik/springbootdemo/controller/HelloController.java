package com.gumeik.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
//    注入bean，数据库连接池
    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")//映射路径
    public String hello(){
        System.out.println(dataSource);
        return "hello string boot!";
    }
}
