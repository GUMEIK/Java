package com.gumeik.domin.service;

import com.gumeik.domin.User;
import com.gumeik.domin.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aplicationContext.xml");
//        UserDao userDao = (UserDao) applicationContext.getBean("user");
        userDao.save();
        System.out.println("service层调用dao层保存了");
    }
}
