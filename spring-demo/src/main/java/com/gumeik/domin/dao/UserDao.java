package com.gumeik.domin.dao;

public class UserDao {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void save(){
        System.out.println(this.username);
        System.out.println("dao层保存数据！");
    }
}
