package com.hendisantika.springmvcdemo.controller;

import com.hendisantika.springmvcdemo.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringMVCDemo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 06.33
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;

}
