package com.gumeik.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//启动引导类,这是工程的入口，
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
