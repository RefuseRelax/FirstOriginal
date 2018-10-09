package com.firstoriginal.online;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = {"com.jingluu.example.springboot.dao"},sqlSessionFactoryRef = "sqlSessionFactory")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
