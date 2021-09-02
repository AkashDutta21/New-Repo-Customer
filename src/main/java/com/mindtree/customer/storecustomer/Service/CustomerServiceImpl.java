package com.mindtree.customer.storecustomer.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.customer.storecustomer.Dao.CustomerDao;
import com.mindtree.customer.storecustomer.entity.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao employeeDao;

//	private static List<Employee> emp = new ArrayList<Employee>();
//	
//	static {
//		emp.add(new Employee(1, "ABC Road"));
//		emp.add(new Employee(2, "EFG Road"));
//	}
	
	public Customer findEmployeeById(long id) {
		return employeeDao.getById(id);
	}
	
	public List<Customer> findAll(){
		return employeeDao.findAll();
	}
	
	public Customer addEmployee(Customer empl) {
		return employeeDao.save(empl);
	}

}
