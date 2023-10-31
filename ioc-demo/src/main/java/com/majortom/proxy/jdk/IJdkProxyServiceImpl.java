package com.majortom.proxy.jdk;

import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/31 21:27
 **/
@Service("demo1")
public class IJdkProxyServiceImpl implements IJdkProxyService,TopInterface {
    @Override
    public void doMethod1() {
        System.out.println("JdkProxyServiceImpl.doMethod1()");
    }

    @Override
    public String doMethod2() {
        System.out.println("JdkProxyServiceImpl.doMethod2()");
        return "Hello world!";
    }

    @Override
    public String doMethod3() throws Exception {
        System.out.println("JdkProxyServiceImpl.doMethod3()");
        throw new Exception("Some exception...");
    }

    @Override
    public void nothing() {
        System.out.println("Nothing");
    }
}
