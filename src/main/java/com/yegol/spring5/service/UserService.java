package com.yegol.spring5.service;

import com.yegol.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value = "userService") //<bean id = "userService" class="……"/>
//@Service
//@Controller
@Service
public class UserService {

    @Value(value="abc")
    private String name;
//    定义UserDao属性  不需要添加set方法
//    添加注入属性注解
//    @Autowired  //根据类型进行注入
//    一个接口可以有多个实现类，所以为了清楚是哪一个实现类
//    @Qualifier(value = "userDaoImpl1")
//    @Resource //根据类型进行注入
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;
    public void add(){
        System.out.println("service add..."+name);
        userDao.add();
    }
}
