package net.lexuan.consumer;

import net.lexuan.api.service.HelloService;
import net.lexuan.api.vo.Param;
import net.lexuan.api.vo.Result;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ctx.xml");

        HelloService helloService = ctx.getBean(HelloService.class);
        for (int i = 0; i < 100; i++) {
            Result result = helloService.hello(new Param("upton", 18));
        }
        System.out.println("OK");
    }
}
