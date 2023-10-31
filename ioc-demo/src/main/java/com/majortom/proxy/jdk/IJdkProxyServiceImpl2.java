package com.majortom.proxy.jdk;

import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/31 23:00
 **/
@Service
public class IJdkProxyServiceImpl2{
//    @Override
    public void doMethod1() {
        System.out.println("JdkProxyServiceImpl2.doMethod1()");
    }

//    @Override
    public String doMethod2() {
        System.out.println("JdkProxyServiceImpl2.doMethod2()");
        return "Hello world!";
    }

//    @Override
    public String doMethod3() throws Exception {
        System.out.println("JdkProxyServiceImpl2.doMethod3()");
        throw new Exception("Some exception...");
    }
}
