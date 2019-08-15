package com.sejin.mybatisorhibernate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sejin.mybatisorhibernate")
public class MybatisOrHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisOrHibernateApplication.class, args);
    }

}
