package com.gumeik.domin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//
//<bean id="bookDao1" class="com.gumeik.domin.dao.BookDao1">
//    <property name="bookname" value="《白夜行》"></property>
//</bean>
@Component("bookDao1")
public class BookDao1 {

    @Override
    public String toString() {
        return "BookDao{" +
                "bookname='" + bookname + '\'' +
                '}';
    }
    @Value("改变月亮与六便士注入")//普通变量注入
    private String bookname = "月亮与六便士";
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }


}
