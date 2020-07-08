package com.gumeik.domin.demo;

import com.gumeik.domin.service.UserService;

import javax.xml.ws.Service;

public class App {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.save();
    }
}
