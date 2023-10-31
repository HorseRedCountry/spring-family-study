package com.majortom.proxy.jdk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 前面工具类 --注解型
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/31 21:45
 **/
@Aspect
@Component
@EnableAspectJAutoProxy
public class LogAspect {

    @Pointcut("execution(* com.majortom.proxy.jdk.*.*(..))")
    private void pointCutMethod() {

    }

    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===========================================");
        System.out.println("环绕通知：进入方法");
        Object proceed = pjp.proceed();
        System.out.println("===========================================");
        return proceed;
    }

    @Before("pointCutMethod()")
    public void doBefore(){
        System.out.println("前置通知");
    }

    @AfterReturning(pointcut = "pointCutMethod()",returning = "result")
    public void doAfterRunning(String result){
        System.out.println("后置通知，返回值："+result);
    }

    @AfterThrowing(pointcut = "pointCutMethod()",throwing = "e")
    public void doAfterThrowing(Exception e){
        System.out.println("异常通知，异常："+e.getMessage());
    }

    @After("pointCutMethod()")
    public void doAfter(){
        System.out.println("最终通知");
    }




















}
