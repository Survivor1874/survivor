package com.lin.learn.survivor.controller;

import com.lin.learn.survivor.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-09 15:47
 **/
@RestController
public class MybatisPlusController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(path = "/apps", method = RequestMethod.POST)
    public Object getInfo() {
        return "hello world";
    }
}
