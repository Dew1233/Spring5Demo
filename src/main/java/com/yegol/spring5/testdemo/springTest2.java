package com.yegol.spring5.testdemo;

import com.yegol.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest2 {
    @Test
    public void testService(){
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        UserService userService =
                context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

    public void testService2(){

    }
}
