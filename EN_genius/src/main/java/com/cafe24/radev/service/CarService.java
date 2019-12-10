package com.cafe24.radev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CarMapper;
import com.cafe24.radev.vo.voCarRegister;

@Service
public class CarService {
	
	@Autowired private CarMapper carMapper;
	
	public voCarRegister getCarUpdate(String cuscar) {
		
		
		return carMapper.getCarUpdate(cuscar);
	}
	
	
	public List<voCarRegister> getCarList() {
	return carMapper.getCarList();
	}
	//받은 매개변수로 다른 메서드를 호출한다 이떄 내가 받은 매게변수를 대입한다
	public int getCarInsert(voCarRegister vcreg) {
		return carMapper.getCarInsert(vcreg);
		
		
	}
}
