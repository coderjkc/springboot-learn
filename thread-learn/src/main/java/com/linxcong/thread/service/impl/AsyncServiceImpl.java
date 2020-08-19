package com.linxcong.thread.service.impl;

import com.linxcong.thread.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 *
 * @title: AsyncServiceImpl
 * @Author linchong
 * @Date: 20-8-19 上午11:39
 * @Version 1.0
 * @Description 异步任务的实现
 */
@Slf4j
@Service
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async("asyncServiceExecutor")
    public void executeAsync() {
        log.info("begin exec async service...");
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("end of execution");
    }
}
