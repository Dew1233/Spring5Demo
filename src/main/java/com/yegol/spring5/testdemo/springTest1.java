package com.yegol.spring5.testdemo;

import com.yegol.spring5.autowrite.Dept;
import com.yegol.spring5.autowrite.Emp;
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
    @Test
    public void TestDemo2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }
}
