package com.hendisantika.springmvcdemo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringMVCDemo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 06.17
 */
@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = -1280037900360314186L;

    private Integer id;
    private String name;
    private Integer age;
    private String dept;
}
