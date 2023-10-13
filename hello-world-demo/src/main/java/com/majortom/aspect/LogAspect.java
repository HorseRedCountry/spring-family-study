package com.majortom.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/13 15:14
 **/
@Aspect
public class LogAspect {
    @Around("execution(* com.majortom.service.*.*(..))")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        System.out.println("Execute method: "+method.getName());
        return pjp.proceed();
    }
}
