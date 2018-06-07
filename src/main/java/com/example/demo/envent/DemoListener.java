package com.example.demo.envent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by yinzf on 2018/6/7.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEnvent>{

    public void onApplicationEvent(DemoEnvent envent){
        String msg  = envent.getMsg();
        System.out.println("DemoListener接收到了发布的消息" + msg);
    }

}
