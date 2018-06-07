package com.example.demo.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by yinzf on 2018/6/7.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsycTask(Integer i){
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsycTaskPlus(Integer i){
        System.out.println("执行异步任务+1：" + (i+1));
    }
}
