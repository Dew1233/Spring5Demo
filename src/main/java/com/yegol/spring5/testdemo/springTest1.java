package com.yegol.spring5.testdemo;

import com.yegol.spring5.springdemo.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest1 {

    @Test
    public void Testdemo1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu user = context.getBean("user",Stu.class);
        user.add();
    }
}
