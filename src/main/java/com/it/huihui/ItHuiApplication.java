package com.it.huihui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.it.huihui.mapper")
public class ItHuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItHuiApplication.class,args);
    }

}
