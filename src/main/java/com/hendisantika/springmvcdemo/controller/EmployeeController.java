package com.hendisantika.springmvcdemo.controller;

import com.hendisantika.springmvcdemo.dao.EmployeeDAO;
import com.hendisantika.springmvcdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee) {
        try {
            if (employeeDAO.getEmployeeById(employee.getId()) != null) ;
            employeeDAO.updateEmployee(employee);
        } catch (EmptyResultDataAccessException e) {
            System.out.println("inside catch");
            employeeDAO.saveEmployee(employee);
        }
        return new ModelAndView("redirect:/employees");
    }

}
