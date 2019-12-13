package com.cafe24.radev.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.Customer;

@Mapper
public interface CustomerMapper {
	public List<Customer> getCustomerList();
<<<<<<< HEAD
	public void getCustomerInsert(Customer customer);
	public String getCustomerInsertAjax(String name, String birth, String phone);
=======
	public void getCustomerInsert();
>>>>>>> refs/heads/develop
}
