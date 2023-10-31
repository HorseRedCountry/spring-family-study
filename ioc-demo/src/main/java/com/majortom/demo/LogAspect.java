package com.majortom.demo;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * <p>
 * 切面类
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/31 15:40
 **/
public class LogAspect {

    /**
     * 环绕通知
     *
     * @param pjp /
     * @return /
     * @throws Throwable /
     */
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("-------------------------------");
        System.out.println("环绕通知：进入方法");
        Object proceed = pjp.proceed();
        System.out.println("环绕通知：退出方法");
        System.out.println("-------------------------------");
        return proceed;
    }

    /**
     * 前置通知
     */
    public void doBefore() {
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     *
     * @param result 返回值
     */
    public void doAfterReturning(String result) {
        System.out.println("后置通知，返回值：" + result);
    }

    /**
     * 异常通知
     *
     * @param e 异常
     */
    public void doAfterThrowing(Exception e) {
        System.out.println("异常通知，异常：" + e.getMessage());
    }

    /**
     * 最终通知
     */
    public void doAfter() {
        System.out.println("最终通知");
    }

}
