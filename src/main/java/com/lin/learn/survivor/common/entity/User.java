package com.lin.learn.survivor.common.entity;

import lombok.Data;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-10-09 15:59
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
