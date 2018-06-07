package com.example.demo.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yinzf on 2018/6/7.
 */
public class TestProfile {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

        annotationConfigApplicationContext.getEnvironment().addActiveProfile("prod");
        annotationConfigApplicationContext.register(ProfileConfig.class);
        annotationConfigApplicationContext.refresh();

        DemoBean demoBean = annotationConfigApplicationContext.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        annotationConfigApplicationContext.close();
    }
}
