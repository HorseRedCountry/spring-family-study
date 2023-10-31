package com.majortom.proxy.jdk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/31 21:59
 **/
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.majortom.proxy.jdk");
        IJdkProxyService bean = context.getBean("demo1",IJdkProxyService.class);
//        IJdkProxyServiceImpl bean = context.getBean(IJdkProxyServiceImpl.class);
        bean.doMethod1();
        bean.doMethod2();
        try {
            bean.doMethod3();
        } catch (Exception e) {
            System.out.println("method3()执行完毕！");
        }

//        IJdkProxyServiceImpl2 bean1 = context.getBean(IJdkProxyServiceImpl2.class);
//        bean1.doMethod1();
        TopInterface bean1 = context.getBean(TopInterface.class);
        bean1.nothing();
    }
}
