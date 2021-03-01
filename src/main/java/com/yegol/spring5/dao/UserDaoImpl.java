package com.yegol.spring5.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void add() {

    }

    public void login(){
//        登录登录过程
    }

    @Override
    public int sum(int a, int b) {
        System.out.println("add方法执行了……");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了……");
        return id;
    }
}
