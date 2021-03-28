package com.lzq.springboot;

import com.lzq.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring Boot单元测试
 * 可以在测试期间很方便的类似编码一样自动注入容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void testHelloService() {
        boolean b = ioc.containsBean("helloService01");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
