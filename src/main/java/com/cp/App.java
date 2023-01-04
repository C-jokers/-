package com.cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName App * @Description
 * @Author Administrator
 * @Date 16:39 2023/1/4
 * @Version 1.0
 **/
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}