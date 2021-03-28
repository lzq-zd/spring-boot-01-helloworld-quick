package com.lzq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 导入Spring的配置文件 @ImportResource(locations = {"classpath:路径"})
 */
//@ImportResource(locations = {"classpath:路径"})
@SpringBootApplication
public class SpringBoot01HelloworldQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01HelloworldQuickApplication.class, args);
    }

}
