package com.it.huihui.controller;

import com.it.huihui.en.ApplicationEnu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private  static  final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/hello")
    public String test(){
        return ApplicationEnu.APP_ID.getAppMsg();
    }
}
