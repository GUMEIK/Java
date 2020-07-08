package com.gumeik.domin.dao;

import org.springframework.stereotype.Component;
public class BookDao1 {
    @Override
    public String toString() {
        return "BookDao{" +
                "bookname='" + bookname + '\'' +
                '}';
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    private String bookname = "月亮与六便士";
}
