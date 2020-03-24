package org.javaboy.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/24 22:41
 */
@Service
public class HelloService {

    /**
     * 第一次任务结束后延迟两秒钟开始第二次定时任务
     */
    @Scheduled(fixedDelay = 2000)
    public void fixedDelay() {
        System.out.println("HelloService.fixedDelay>>>" + new Date());
    }

    /**
     * 两次定时任务开始的间隔时间为2秒
     */
    @Scheduled(fixedRate = 2000)
    public void fixedRate() {
        System.out.println("HelloService.fixedRate>>>" + new Date());
    }

    //----功能强大cron表达式

    @Scheduled(cron = "0/5 * * * * ?")
    public void cron(){
        System.out.println("HelloService.cron>>>" + new Date());
    }
}
