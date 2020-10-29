package com.yunzimo.mapper;


import com.yunzimo.Bean.Customer;
import com.yunzimo.Bean.Key;

import java.util.List;

public interface CustomerMapper {
    public List<Customer> showAllCustomers();
    public Customer QueryById(int id);
    public int updateCustomer(Customer customer);
    public int addCustomer(Customer customer);
    public List<Customer> QueryByKey(Key key);
}