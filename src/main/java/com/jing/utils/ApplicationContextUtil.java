package com.jing.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName:ApplicationContextUtil
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/16 15:32
 * @Version 1.0
 */
public class ApplicationContextUtil {
    private static ApplicationContext ac;
    public static ApplicationContext getApplicationContext(String applicationContext){
        return new ClassPathXmlApplicationContext(applicationContext);
    }
}
