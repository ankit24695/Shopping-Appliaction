package com.shopping.service;

import java.util.List;

import com.shopping.exception.CustomerException;
import com.shopping.module.Customer;


public interface CustomerService {

	public Customer addCustomer(Customer customer) throws CustomerException;
	
	public Customer updateCustomer(Customer customer) throws CustomerException;
	
	public Customer removeCustomer(String email) throws CustomerException;
	
	public Customer viewCustomer(String email) throws CustomerException;
	
	public List<Customer> viewAllCustomer() throws CustomerException;
	
	
}
