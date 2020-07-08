package com.gumeik.test1;

public interface App1 {
    public void run();
    default void p(){
        System.out.println("接口的defalut方法执行了");
    }
}
