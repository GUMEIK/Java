package com.gumeik.domin.web;

import com.gumeik.domin.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Book {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao book = (BookDao) applicationContext.getBean("bookDao");
        System.out.println(book);
    }
}
