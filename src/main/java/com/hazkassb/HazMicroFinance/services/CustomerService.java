package com.hazkassb.HazMicroFinance.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazkassb.HazMicroFinance.models.Customer;
import com.hazkassb.HazMicroFinance.repositories.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAll(){
		return (List<Customer>) customerRepository.findAll();
	}
	
	
	public Optional<Customer> getOne(int Id) {
		return customerRepository.findById(Id);
	}
	
	
	public void addNew(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void update(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void delete(Customer customer) {
//		customerRepository.deleteById(Id);
		customerRepository.delete(customer);
	}

}
