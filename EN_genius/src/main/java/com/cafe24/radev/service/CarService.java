package com.cafe24.radev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CarMapper;
import com.cafe24.radev.vo.voCarRegister;

@Service
public class CarService {
	
	@Autowired private CarMapper carMapper;
	
	public List<voCarRegister> getCarList() {
	return carMapper.getCarList();
	}
	
	public String getCarInsert() {
		return carMapper.getCarInsert();
		
		
	}
}
