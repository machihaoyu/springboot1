//package com.example.demo.aop;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
///**
// * Created by yinzf on 2018/6/6.
// */
//@Aspect
//@Component
//public class TimeAspect {
//    @Around("execution(* com.example.demo.TestController..*(..))")
//    public Object method(ProceedingJoinPoint pjp) throws Throwable {
//
//        System.out.println("AOP=====Aspect处理=======");
//        Object[] args = pjp.getArgs();
//        for (Object arg : args) {
//            System.out.println("AOP参数为:" + arg);
//        }
//
//        long start = System.currentTimeMillis();
//        Object object = pjp.proceed();
//        System.out.println("Aspect 耗时:" + (System.currentTimeMillis() - start));
//
//        return object;
//    }
//}
