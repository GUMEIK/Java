package com.gumeik.domin.web;


import com.gumeik.domin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;

public class App {


    public static void main(String[] args) {
//  1.      不适用装配
//        UserService service = new UserService();
//        service.save();
//  2.      使用装配
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();



    }
}
