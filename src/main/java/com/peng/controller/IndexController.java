package com.peng.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class IndexController {

    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/set")
    public String set(HttpSession httpSession){
        logger.debug("进入set方法.....");
        httpSession.setAttribute("user","spring-boot-session");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String get(HttpSession httpSession){
        logger.debug("进入get方法.....");
        return httpSession.getAttribute("user") + ":" + port;
    }
}
