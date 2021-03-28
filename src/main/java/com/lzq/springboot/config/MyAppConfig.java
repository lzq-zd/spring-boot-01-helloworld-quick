package com.lzq.springboot.config;

import com.lzq.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyAppConfig
 * @Author: 中都
 * @Date: 2021/3/28 20:20
 * @Description: @Configuration指明当前类是一个配置类，用来代替Spring之前的配置文件
 */
@Configuration
public class MyAppConfig {

    /**
     * 注：@Bean将方法的返回值添加到容器中，容器中这个组件的默认id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService01() {
        System.out.println("配置类给容器添加组件了...");
        return new HelloService();
    }
}
