package com.cafe24.radev.service;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.radev.mapper.CustomerMapper;
import com.cafe24.radev.vo.Customer;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	public List<Customer> getCustomerList(){
		List<Customer> list = customerMapper.getCustomerList();
		return list;
	}
	
	public void getCustomerInsert() {
		customerMapper.getCustomerInsert();
	}
}
