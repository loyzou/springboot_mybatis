package org.xxjr.springboot1126;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.xxjr.*"})
@MapperScan(basePackages = {"org.xxjr.*"})
public class Springboot1126Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot1126Application.class, args);
    }
}
