package com.yegol.spring5.aopano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 编写增强逻辑
 */
@Component
@Aspect //生成代理对象
public class UserProxy {
    /**
     * 前置通知
     */
    @Before(value = "execution(* com.yegol.spring5.aopano.User.add())")
    public void before(){
        System.out.println("before……");
    }

    /**
     * 有异常就不执行，后置通知
     */
    @AfterReturning(value = "execution(* com.yegol.spring5.aopano.User.add())")
    public void Returning(){
        System.out.println("Returning……");
    }

    /**
     * 最终通知
     */
    @After(value = "execution(* com.yegol.spring5.aopano.User.add())")
    public void after(){
        System.out.println("after……");
    }
    /*
    异常的时候才会执行
     */
    @AfterThrowing(value = "execution(* com.yegol.spring5.aopano.User.add())")
    public void afterThrowing(){
        System.out.println("afterThrowing……");
    }
    @Around(value = "execution(* com.yegol.spring5.aopano.User.add())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around之前……");
//        被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }
}
