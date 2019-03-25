package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAllCustomers();

    Customer getCustomerById(int id);

    void saveCustomer (Customer customer);

    void removeCustomer (int id);
}
