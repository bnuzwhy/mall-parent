package com.why;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: wanghongyu | stan.wang@paytm.com
 * @create: 2020/11/27 5:45 下午
 **/
@SpringBootApplication
@MapperScan("com.why.dao")
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }
}
