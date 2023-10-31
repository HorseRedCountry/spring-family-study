package com.majortom.demo;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/31 15:37
 **/
public class AopDemoServiceImpl {

    public void doMethod1() {
        System.out.println("AopDemoServiceImpl1.doMethod1()");
    }

    public String doMethod2() {
        System.out.println("AopDemoServiceImpl1.doMethod2()");
        return "Hello World!";
    }

    public String doMethod3() throws Exception {
        System.out.println("AopDemoServiceImpl1.doMethod3()");
        throw new Exception("Some exceptions...");
    }
}
