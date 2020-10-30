package com.yunzimo.Controller;


import com.yunzimo.Bean.Employee;
import com.yunzimo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("showAllEmp")
    @ResponseBody
    public List<Employee> showAllEmp(){
        List<Employee> employees = employeeService.ShowAllEmp();
        System.out.println("ajax请求获得的所有项目经理"+employees);
        return  employees;
    }

    @RequestMapping("getBaoxiaoByeid")
    @ResponseBody
    public Employee getBaoxiaoByeid(){
        Employee baoxiaoByeid = employeeService.getBaoxiaoByeid(1);
        System.out.println("ajax获得的id为1的包含报销信息的员工数据"+baoxiaoByeid);
        return baoxiaoByeid;
    }


}
