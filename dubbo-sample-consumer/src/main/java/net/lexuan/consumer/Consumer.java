package net.lexuan.consumer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import net.lexuan.api.service.HelloService;
import net.lexuan.api.vo.Param;
import net.lexuan.api.vo.Result;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

public class Consumer {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ctx.xml");

        HelloService helloService = ctx.getBean(HelloService.class);
        
        helloService.hello(new Param("upton", 18));
        Future<Result> h1 = RpcContext.getContext().getFuture();
        
        helloService.hello(new Param("louis", 7));
        Future<Result> h2 = RpcContext.getContext().getFuture();
        
        Result r1 = h1.get();
        Result r2 = h2.get();
        
        System.out.println("OK");
        System.out.println(r1.getMsg());
        System.out.println(r2.getMsg());
    }
}
