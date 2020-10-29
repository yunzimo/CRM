package com.yunzimo.Service;

import com.yunzimo.Bean.Customer;
import com.yunzimo.Bean.Key;

import java.util.List;

public interface CustomerService {
    public List<Customer> showAllCustomers();
    public Customer QueryById(int id);
    public boolean updateCustomer(Customer customer);
    public boolean addCustomer(Customer customer);
    public List<Customer> QueryByKey(Key key);
}
