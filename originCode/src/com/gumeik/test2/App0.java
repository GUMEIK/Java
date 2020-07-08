package com.gumeik.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App0 {
    @Override
    public String toString() {
        return "App0{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name = "gumeik";
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("milk");
        for (String s :list){
            System.out.println(s);
        }

    }
}
