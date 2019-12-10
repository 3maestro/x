package com.cafe24.radev.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.Customer;

@Mapper
public interface CustomerMapper {
	public List<Customer> getCustomerList();
//	
//	public int addCustomer(Customer Customer);
//	
//	public Customer getCustomerById(String CustomerId);
//	
//	public int modifyCustomer (Customer Customer);
//	
//	public int delCustomer(String CustomerId, String CustomerPw);
//	
//	public Customer getCustomerLogin(Customer Customer);
//	
//	public List<Customer> getCustomerSearchList (String sk, String sv);	
}
