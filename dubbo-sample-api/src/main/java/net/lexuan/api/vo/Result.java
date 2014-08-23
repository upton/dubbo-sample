package net.lexuan.api.vo;

import java.io.Serializable;

public class Result implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private String msg;

    public Result(String name, String msg){
        this.name = name;
        this.msg = msg;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
