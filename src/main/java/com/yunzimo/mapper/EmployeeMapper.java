package com.yunzimo.mapper;


import com.yunzimo.Bean.Employee;

import java.util.List;


public interface EmployeeMapper {
    public Employee QueryById(int eid);
    public List<Employee> showAllEmp();
}