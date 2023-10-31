package com.majortom.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/31 15:59
 **/
public class DemoMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml");
        AopDemoServiceImpl demoService = context.getBean("demoService", AopDemoServiceImpl.class);
        demoService.doMethod1();
        demoService.doMethod2();
        try {
            demoService.doMethod3();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
