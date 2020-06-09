package com.springboot.logback.controller;

import com.springboot.logback.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
public class UserController {
    //传统方式
//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 访问首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
//        logger.debug("记录debug日志"+ date);
//        logger.info("访问了index方法"+ date);
//        logger.error("记录了error错误日志"+ date);
        log.debug("@Slf4j记录debug日志"+ date);
        log.info("@Slf4j记录info日志"+ date);
        log.error("@Slf4j记录error日志"+ date);
        User user = new User();
    user.setUserId(111);
    user.setUserName("finish logback");
    log.info(user.toString());
        return "index";
    }
    /**
     * @param args
     */
/*    public static void main(String[] args) {
        logger.info("logback 成功了");
        logger.error("logback 成功了");
    }*/
}
