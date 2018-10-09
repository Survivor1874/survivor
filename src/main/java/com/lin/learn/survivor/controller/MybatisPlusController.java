package com.lin.learn.survivor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-09 15:47
 **/
@RestController
public class MybatisPlusController {

    @RequestMapping(path = "/apps", method = RequestMethod.POST)
    public Object getInfo() {
        return "hello world";
    }
}
