package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.etc.dao")
@SpringBootApplication
public class MavenspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenspringbootApplication.class, args);
    }

}
