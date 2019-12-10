package com.cafe24.radev.controller;

import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpSession;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.radev.service.CustomerService;
import com.cafe24.radev.vo.Customer;

@Controller
public class CustomerController {
	@Autowired CustomerService customerService;
	
	@GetMapping("/customerList")
	public String getMemberList(Model model) {
		List<Customer> list = customerService.getCustomerList();
		
		model.addAttribute("customerList", list);
		
		return "/customer/customerList";
	}
	
	@GetMapping("/customerInsert")
	public String getCustomerInsert(Model model, Customer customer) {
		System.out.println(customer);
		return "/customer/customerList";
	}
	
	@GetMapping("/customerInsertPage")
	public String getCustomerInsert() {
		return "/customer/customerInsert";
	}
}
