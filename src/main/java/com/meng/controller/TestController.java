package com.meng.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhaomengxia
 * @create 2019/8/1 14:12
 */
@RestController
@RequestMapping(value = "/test")
@Api(description = "测试")
public class TestController {

    @GetMapping(value = "/testMethod")
    @ApiOperation(value = "测试接口")
    public String test(String s){
        return s;
    }
}
