package com.kanouakira.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyAspect {
    /**
     * 自定义前置通知
     */
    public void before(){
        System.out.println("before method invoke");
    }

    /**
     * 自定义环绕通知,可做性能检测
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = pjp.proceed();
        long end = System.currentTimeMillis();
        long cost = end - start;
        System.out.println("耗时"+cost+"毫秒");
        return proceed;
    }
}
