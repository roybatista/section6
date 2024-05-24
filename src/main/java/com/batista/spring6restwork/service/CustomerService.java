package com.batista.spring6restwork.service;

import com.batista.spring6restwork.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    public Customer getCustomer(UUID id);
    public List<Customer> getCustomers();
}
