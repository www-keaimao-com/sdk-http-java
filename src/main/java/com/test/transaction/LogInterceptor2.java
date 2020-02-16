package com.test.transaction;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/*这里介绍的是用的是XML文件的方法*/

public class LogInterceptor2 implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Spring AOP befor 2");
        Object proceed = methodInvocation.proceed();
        System.out.println("Spring AOP after 2");
        return proceed;
    }
}