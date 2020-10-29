package com.yunzimo.Service;

import com.yunzimo.Bean.Employee;
import com.yunzimo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> ShowAllEmp() {
        List<Employee> employees = employeeMapper.showAllEmp();
        return employees;
    }
}
