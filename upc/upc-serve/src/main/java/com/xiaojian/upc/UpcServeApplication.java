package com.xiaojian.upc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.xiaojian.upc.mapper"})
public class UpcServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpcServeApplication.class, args);
    }

}
