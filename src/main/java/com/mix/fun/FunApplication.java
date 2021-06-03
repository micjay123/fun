package com.mix.fun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author langchaojie
 */
@SpringBootApplication
public class FunApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunApplication.class, args);
        System.out.println("=======启动成功========");
    }

}