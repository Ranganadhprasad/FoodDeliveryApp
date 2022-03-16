package com.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advices.CustomerNotFoundException;
import com.entity.Customer;
import com.repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	
	public Customer addCustomer(Customer c) {
		customerRepo.save(c);
		return c;
	}
	
	public List<Customer> getCustomers() {
		List<Customer> c1 = customerRepo.findAll();
		return c1;
	}
	
	public Customer getCustomerById(int cid) throws Throwable {
		Supplier s1 = ()-> new CustomerNotFoundException("Id Not Found");
		Customer c1 = customerRepo.findById(cid).orElseThrow(s1);
		return c1;
	}
	
	public Customer updateCustomer(Customer c) throws Throwable {
		int cid = c.getCid();
		
		Supplier s1 = ()-> new CustomerNotFoundException("Id Not Found");
		Customer c1 = customerRepo.findById(cid).orElseThrow(s1);
		c1.setCname(c1.getCname());
		c1.setCaddress(c1.getCaddress());
		return c1;
	}
	
	public String deleteCustomerById(int cid) {
		customerRepo.deleteById(cid);
		return "Row Deleted Successfully";
	}

}
