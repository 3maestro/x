package com.cafe24.radev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CarMapper;
import com.cafe24.radev.vo.VoCarRegister;

@Service
public class CarService {
	
	@Autowired private CarMapper carMapper;
	
	//차량 수정 조회 메서드
	public VoCarRegister getCarUpdate(String cuscar) {
		
		
		return carMapper.getCarUpdate(cuscar);
	}
	
	//차량 리스트 메서드
	public List<VoCarRegister> getCarList() {
	return carMapper.getCarList();
	}
	
	//받은 매개변수로 다른 메서드를 호출한다 이때 내가 받은 매개변수를 대입한다
	//차량 등록 메서드
	public int getCarInsert(VoCarRegister vcreg) {
		
		return carMapper.getCarInsert(vcreg);
		
		
	}
}
