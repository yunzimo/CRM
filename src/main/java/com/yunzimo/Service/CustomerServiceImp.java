package com.yunzimo.Service;

import com.yunzimo.Bean.Customer;
import com.yunzimo.Bean.Key;
import com.yunzimo.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<Customer> showAllCustomers() {
        List<Customer> customers = customerMapper.showAllCustomers();
        System.out.println("显示所有的顾客信息"+customers);
        return customers;
    }

    @Override
    public Customer QueryById(int id) {
        Customer customer = customerMapper.QueryById(id);
        System.out.println("通过id查到的顾客为:"+customer);
        return customer;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        int i = customerMapper.updateCustomer(customer);
        return i>0;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        int i = customerMapper.addCustomer(customer);
        return i>0;
    }

    @Override
    public List<Customer> QueryByKey(Key key) {
        List<Customer> customers = customerMapper.QueryByKey(key);
        System.out.println(customers);
        return customers;
    }
}
