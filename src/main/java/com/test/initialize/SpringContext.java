/*
 * Kilimall Inc.
 * Copyright (c) 2016. All Rights Reserved.
 */

package com.test.initialize;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.Map;

/**
 */

public class SpringContext implements ApplicationContextAware {


    private static final Logger logger = LoggerFactory.getLogger(SpringContext.class);

    private static ApplicationContext applicationContext = null;

    /***
     * 当继承了ApplicationContextAware类之后，那么程序在调用 getBean(String)的时候会自动调用该方法，不用自己操作
     */
    public void setApplicationContext(ApplicationContext applicationContext) {
        logger.info("setApplicationContext :::: " + applicationContext);
        SpringContext.applicationContext = applicationContext;
    }
    // 获取 bean
    public static Object getBean(String beanName) {
        try {
            if(applicationContext == null){
                logger.error("applicationContext is null");
            }
            return applicationContext.getBean(beanName);
        } catch (Exception e) {
            logger.warn("not fund bean [" + beanName + "]", e);
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String beanName, Class<T> clazz) {
        return (T) getBean(beanName);
    }

    public static Object getBeanThrowException(String beanID) {
        return getBeanThrowException(beanID, Object.class);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBeanThrowException(String beanID, Class<T> clazz) {

        if (beanID == null || "".equals(beanID)) {
            throw new IllegalArgumentException("beanID is empty [" + beanID + "]");
        }

        try {
            return (T) applicationContext.getBean(beanID);
        } catch (Exception e) {
            logger.error("not fund bean [" + beanID + "]", e);
            throw new NullPointerException("not fund bean [" + beanID + "] !!!!!!!");
        }
    }


}