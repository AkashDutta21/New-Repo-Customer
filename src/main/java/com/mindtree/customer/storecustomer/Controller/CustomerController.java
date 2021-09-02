package com.mindtree.customer.storecustomer.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mindtree.customer.storecustomer.Service.CustomerServiceImpl;
import com.mindtree.customer.storecustomer.entity.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceImpl service;
	
	@GetMapping(path = "/customer/{id}")
	public Customer retriveEmployeeById(@PathVariable long id) {
		Customer emp = service.findEmployeeById(id);
		return emp;
	}
	
	@GetMapping(path = "/customer")
	public List<Customer> retriveAllEmployee(){
		List<Customer> emp = service.findAll();
		return emp;
	}
	
	@PostMapping(path = "/customer")
	public Customer addEmployee(@RequestBody Customer emp){
		Customer empl = service.addEmployee(emp);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(empl.getId()).toUri();
		ResponseEntity.created(location).build();
		return emp;
	}
}
