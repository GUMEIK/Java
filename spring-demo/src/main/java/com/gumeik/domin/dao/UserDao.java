package com.gumeik.domin.dao;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "username='" + username + '\'' +
                '}';
    }

    public void save(){
        System.out.println(this.username);
        System.out.println("dao层保存数据！");
    }
}
