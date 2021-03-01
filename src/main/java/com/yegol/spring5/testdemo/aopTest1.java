package com.yegol.spring5.testdemo;

import com.yegol.spring5.aopano.User;
import com.yegol.spring5.aopxml.Book;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopTest1 {
    @Test
    public void testAopAnno(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }

    @Test
    public void testAopXml(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean6.xml");
        Book book = context.getBean("book",Book.class);
        book.buy();
    }

}
