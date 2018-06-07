package com.example.demo.envent;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * Created by yinzf on 2018/6/7.
 */
public class DemoEnvent extends ApplicationEvent implements Serializable{
    private String msg;

    public DemoEnvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
