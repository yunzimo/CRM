package com.yunzimo.Service;

import com.yunzimo.Bean.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> ShowAllEmp();
    public Employee getBaoxiaoByeid(int eid);
}
