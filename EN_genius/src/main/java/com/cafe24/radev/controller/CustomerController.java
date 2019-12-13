package com.cafe24.radev.controller;

import java.util.List;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String getCustomerInsert(Model model) {
		return "/customer/customerInsert";
	}
	@PostMapping("/customerInsert")
	public String getCustomerInsert(Model model, Customer customer) {
		System.out.println(customer);
		customerService.getCustomerInsert(customer);
		
		return "/customer/customerList";
	}
	
	@GetMapping("/customerVisit")
	public String getCustomerVisit(Model model) {
		System.out.println("Visit");
		return "/customer/customerVisit";
	}
	
	@PostMapping(value="/customerInsertAjax", produces = "application/json")
	public @ResponseBody String getCustomerInsertAjax(@RequestParam(value="name") String name, @RequestParam(value="birth") String birth, @RequestParam(value="phone") String phone) {
		String code = customerService.getCustomerInsertAjax(name,birth,phone);
		return code;
	}
	
	@GetMapping("/customerSMS")
	public String getCustomerSMS(Model model) {
		System.out.println("SMS");
		return "/customer/customerSMS";
	}

=======
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
	
	@GetMapping("/customerVisit")
	public String getCustomerVisit(Model model) {
		System.out.println("Visit");
		return "/customer/customerVisit";
	}
	
	@GetMapping("/customerSMS")
	public String getCustomerSMS(Model model) {
		System.out.println("SMS");
		return "/customer/customerSMS";
	}
	
	@GetMapping("/customerInsertPage")
	public String getCustomerInsert() {
		return "/customer/customerInsert";
	}
>>>>>>> refs/heads/develop
}
