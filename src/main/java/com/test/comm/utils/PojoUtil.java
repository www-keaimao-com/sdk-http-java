package com.test.comm.utils;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class PojoUtil {

    private PojoUtil() {
        // 禁用构造函数
    }

    /**
     * @Description:  返回不为空的值，如都为空则返回null
     * @Param: [vals]
     * @return: java.lang.Object
     * @Date: 2018/6/5
     */
    public static Object coalesce(Object... vals) {

        for (Object e : vals) {
            if (e != null) {
                return e;
            }
        }
        return null;

    }

}
