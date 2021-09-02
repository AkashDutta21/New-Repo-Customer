package com.mindtree.customer.storecustomer.Service;

import java.util.List;

import com.mindtree.customer.storecustomer.entity.Customer;

public interface CustomerService {
	
	public Customer findEmployeeById(long id);
	public List<Customer> findAll();
	public Customer addEmployee(Customer emp); 
}
