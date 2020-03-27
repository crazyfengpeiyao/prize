package com.luck.prize;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.luck.prize.mapper")
public class LuckApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuckApplication.class, args);
    }

}
