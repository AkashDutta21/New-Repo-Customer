package com.mindtree.customer.storecustomer.entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private long Id;
	private String name;
	private String address;
	
	public Customer() {
		
	}
	
	public Customer(long Id, String name, String address) {
		super();
		this.Id = Id;
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public long getId() {
		return Id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setId(long Id) {
		this.Id = Id;
	}
	
	@Override
	public String toString() {
		return String.format("Employee [Id=%s, address=%s]", Id, address);
	}
	
}
