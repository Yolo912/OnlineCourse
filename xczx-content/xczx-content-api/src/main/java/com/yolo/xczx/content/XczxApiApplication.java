package com.yolo.xczx.content;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableSwagger2Doc
@SpringBootApplication
@ComponentScan(basePackages = {"com.yolo.xczx"})
public class XczxApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XczxApiApplication.class, args);
    }

}
