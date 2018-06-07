package com.example.demo.envent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yinzf on 2018/6/7.
 */
public class TestEnvent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("发布消息");
        context.close();
    }
}
