package com.github.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HAN
 * @version 1.0
 * @create 06-28-21:07
 */
@SpringBootApplication
public class ShardingJdbcApplication {
    public static void main(String[] args){
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
