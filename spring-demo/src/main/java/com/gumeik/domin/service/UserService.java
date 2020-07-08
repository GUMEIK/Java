package com.gumeik.domin.service;

import com.gumeik.domin.dao.UserDao;

public class UserService {
    public void save(){
        UserDao userDao = new UserDao();
        userDao.save();
        System.out.println("service层调用dao层保存了");
    }
}
