package com.test.transaction;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*这里介绍的是用注解的方法*/
@Aspect
@Component
public class LogInterceptor {
    @Before(value = "execution(* com.test.service..*.*(..))")
    public void before(){
        System.out.println("Spring AOP befor 1");
    }
    @After(value = "execution(* com..*.*(..))")
    public void after(){
        System.out.println("Spring AOP after 1");
    }
}