package com.gumeik.domin.web;

import com.gumeik.domin.dao.BookDao1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Book1 {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao1 book1 = (BookDao1) applicationContext.getBean("bookDao1");
        System.out.println(book1);
    }
}
