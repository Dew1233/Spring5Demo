package com.yegol.spring5.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
//        创建接口实现类代理对象

        Class[] interfaces = {UserDao.class};
       /* Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });*/
//        把代理对象传过来：userDao  返回的一个代理对象要来强转一下
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userDao));
        int add = dao.sum(1,2);
        System.out.println(add);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler{
    //    1把创建代理对象UserDaoImpl传递过来
    //有参构造
    private  Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }


//    增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1方法之前执行
        System.out.println("方法之前执行"+method.getName()+"传递的参数"+ Arrays.toString(args));


//        2被增强方法执行
        Object res = method.invoke(obj,args);

//        3方法之后
        System.out.println("方法之后执行……"+obj);

        return res;
    }
}
