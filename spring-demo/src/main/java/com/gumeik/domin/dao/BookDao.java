package com.gumeik.domin.dao;

import org.springframework.stereotype.Component;

//<bean id="bookDao" class="com.gumeik.domin.dao.BookDao"></bean>
@Component("bookDao")
public class BookDao {
    @Override
    public String toString() {
        return "BookDao{" +
                "bookname='" + bookname + '\'' +
                '}';
    }

    private String bookname = "月亮与六便士";
}
