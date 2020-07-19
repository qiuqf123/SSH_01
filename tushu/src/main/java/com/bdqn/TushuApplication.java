package com.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.bdqn.dao")
@SpringBootApplication
public class TushuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TushuApplication.class, args);
    }

}
