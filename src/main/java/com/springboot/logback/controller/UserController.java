package com.springboot.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    /**
     * 访问首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        logger.debug("记录debug日志");
        logger.info("访问了index方法");
        logger.error("记录了error错误日志");
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
