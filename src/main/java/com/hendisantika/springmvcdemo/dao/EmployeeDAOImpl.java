package com.hendisantika.springmvcdemo.dao;

import com.hendisantika.springmvcdemo.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringMVCDemo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/20
 * Time: 06.21
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDAOImpl.class);
    private JdbcTemplate jdbcTemplate;

    // JdbcTemplate setter
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Saving a new Employee
    public void saveEmployee(Employee employee) {
        String sql = "insert into Employee values(?,?,?,?)";
        LOGGER.info("DAO Called {}", sql);
        jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getDept(), employee.getAge());
    }
}
