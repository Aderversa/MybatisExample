package com.twoshou.mapper;

import com.twoshou.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectAll();
    Employee selectById(int id);
}
