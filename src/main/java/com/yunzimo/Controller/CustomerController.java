package com.yunzimo.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunzimo.Bean.Customer;
import com.yunzimo.Bean.Key;
import com.yunzimo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("showAllCustomers")
    public String showAllCustomers(Model model, @RequestParam(defaultValue = "1")int pageNum){
        PageHelper.startPage(pageNum,2);
        List<Customer> customers = customerService.showAllCustomers();
        PageInfo<Customer> pageInfo=new PageInfo<>(customers);
        model.addAttribute("pageInfo",pageInfo);
        return "forward:customer.jsp";
    }

    @RequestMapping("customerEdit")
    public String customerEdit(Model model,int id){
        Customer customer = customerService.QueryById(id);
        model.addAttribute("cu",customer);
        return "forward:customer-edit.jsp";
    }

    @RequestMapping("updateCustomer")
    public String updateCustomer(Customer customer){
        System.out.println("接收到的顾客对象为："+customer);
        boolean b = customerService.updateCustomer(customer);
        if(b){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        return "redirect:showAllCustomers";
    }

    @RequestMapping("addCustomer")
    public String addCustomer(Customer customer){
        customer.setAddtime(new Date());
        System.out.println("获取到的当前系统时间为："+customer.getAddtime());
        boolean b = customerService.addCustomer(customer);
        if(b){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
        return "redirect:showAllCustomers";
    }

    @RequestMapping("QueryByKey")
    public String QueryByKey(Key key, @RequestParam(defaultValue = "1")int pageNum, Model model){
        System.out.println("获得的参数："+key.getCid()+"\t"+key.getKeyword()+"\t"+key.getOrderby());
        PageHelper.startPage(pageNum,2);
        List<Customer> customers = customerService.QueryByKey(key);
        System.out.println("pageInfo处理前的集合数据========================="+customers);
        PageInfo<Customer> pageInfo=new PageInfo<>(customers);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("key",key);
        return "forward:customer.jsp";
    }

    @RequestMapping("showAllCus")
    @ResponseBody
    public List<Customer> showAllCus(){
        List<Customer> customers = customerService.showAllCustomers();
        System.out.println("通过ajax获得的customers表"+customers);
        return  customers;
    }

}
