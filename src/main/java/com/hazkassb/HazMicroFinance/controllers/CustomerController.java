package com.hazkassb.HazMicroFinance.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hazkassb.HazMicroFinance.models.Customer;
import com.hazkassb.HazMicroFinance.services.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Customer> customers = customerService.getAll();
		model.addAttribute("customers", customers);
		
		String username = "Hamza";
		model.addAttribute("username", username);
		
		return "customers";
	}
	
	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Customer> getOne(int Id) {
		return customerService.getOne(Id);
	}
	
	@PostMapping("/addNew")
	public String addNew(Customer customer) {
		customerService.addNew(customer);
		return "redirect:/customers/getAll";
	}
	
	
	@RequestMapping(value="/update", method={RequestMethod.PUT, RequestMethod.GET})
	public String update(Customer customer) {
		customerService.update(customer);
		return "redirect:/customers/getAll";
	}
	
	@RequestMapping(value="/delete", method={RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Customer customer) {
		customerService.delete(customer);
		return "redirect:/customers/getAll";
	}

}
