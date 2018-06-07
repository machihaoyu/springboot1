package com.example.demo.thread;

import com.example.demo.profile.DemoBean;
import com.example.demo.profile.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yinzf on 2018/6/7.
 */
public class TaskTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = annotationConfigApplicationContext.getBean(AsyncTaskService.class);
        for (int i= 0; i<10;i++){
            asyncTaskService.executeAsycTask(i);
            asyncTaskService.executeAsycTaskPlus(i);
        }
        annotationConfigApplicationContext.close();
    }
}
