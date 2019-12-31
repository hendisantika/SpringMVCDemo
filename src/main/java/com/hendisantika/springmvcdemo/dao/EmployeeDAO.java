package com.hendisantika.springmvcdemo.dao;

import com.hendisantika.springmvcdemo.entity.Employee;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringMVCDemo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 06.19
 */
public interface EmployeeDAO {
    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);

    List<Employee> getAllEmployees();
}
