package net.lexuan.provider;

import net.lexuan.api.service.HelloService;
import net.lexuan.api.vo.Param;
import net.lexuan.api.vo.Result;

public class HelloServiceImpl implements HelloService {

    @Override
    public Result hello(Param p) {
        return new Result(p.getName(), "hello");
    }
}