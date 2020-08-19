package com.linxcong.thread;

import com.linxcong.thread.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @title: TestController
 * @Author linchong
 * @Date: 20-8-19 上午11:42
 * @Version 1.0
 * @Description 测试web请求
 */
@Slf4j
@RestController
public class TestController {


    private AsyncService asyncService;

    @Autowired
    public void setAsyncService(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @GetMapping
    public String submit(){
        log.info("start exec asyncService");
        asyncService.executeAsync();
        log.info("end exec asyncService");
        return "SUCCESS";
    }
}
