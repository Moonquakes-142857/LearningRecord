package com.lcy.lr.result;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Result {
    //响应码
    @Autowired
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public Result() {
    }
}
