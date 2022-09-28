package com.shopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.exception.CustomerException;
import com.shopping.module.Customer;

import com.shopping.repository.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService{
    
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer addCustomer(Customer customer) throws CustomerException {
		
		Optional<Customer> opt = customerDao.findByEmail(customer.getEmail());
		
		if(opt.isPresent()) {
			throw new CustomerException("Customer already exist with this email id");
		}
		Customer addedCustomer = customerDao.save(customer);
		return addedCustomer;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		
		Optional<Customer> opt = customerDao.findByEmail(customer.getEmail());
		
		if(opt.isPresent()) {
			Customer updatedCustomer = customerDao.save(customer);
			return updatedCustomer;
			
		}
		else {
			throw new CustomerException("No customer exist with this email id");
		}
		
		
	}

	@Override
	public Customer removeCustomer(String email) throws CustomerException {
		 
		Optional<Customer> opt = customerDao.findByEmail(email);
		
		if(opt.isPresent()) {
			Customer deletedCustomer = opt.get();
			customerDao.delete(deletedCustomer);
			return deletedCustomer;
		}
		else {
			throw new CustomerException("No customer exist with this email id");
		}
			
	}

	@Override
	public Customer viewCustomer(String email) throws CustomerException {
        
		Optional<Customer> opt = customerDao.findByEmail(email);
		
		if(opt.isPresent()) {
			Customer deletedCustomer = opt.get();
			return deletedCustomer;
		}
		else {
			throw new CustomerException("No customer exist with this email id");
		}
	}

	@Override
	public List<Customer> viewAllCustomer() throws CustomerException {
		
		List<Customer> list = customerDao.findAll();
		
		if(list.size()>0) {
			return list;
		}
		else {
			throw new CustomerException("Customer list is empty..");
		}
	}

	
	
	
}
