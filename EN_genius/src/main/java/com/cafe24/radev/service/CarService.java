package com.cafe24.radev.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CarMapper;
import com.cafe24.radev.vo.VoCarDetail;
import com.cafe24.radev.vo.VoCarOption;
import com.cafe24.radev.vo.VoCarRegister;

@Service
public class CarService {
	
	@Autowired private CarMapper carMapper;
	
	public List<VoCarOption> getOpGradeSelect() {
		return carMapper.getOpGradeSelect();
	}
	
	/**
	 * 차량 Detail Insert 메서드
	 * @param voDetail
	 * @return
	 */
	public int getDetailInsert(VoCarDetail voDetail) {		
		return carMapper.getDetailInsert(voDetail);
	}
	
	/**
	 * 연도별 차량 메서드
	 * @return
	 */
	public List<VoCarDetail> getYearCarSelect() { 
		return carMapper.getYearCarSelect(); 
	}
	 
	
	/**
	 * 차량 모델 메서드
	 * @return
	 */
	public List<VoCarDetail> getCarModelSelect() {
		return carMapper.getCarModelSelect();
	}
	
	/**
	 * 차량 종류 메서드
	 * @return
	 */
	public List<VoCarDetail> getCarClassSelect() {
		return carMapper.getCarClassSelect();
	}
	
	/**
	 * 차량 제작회사 메서드
	 * @return
	 */
	public List<VoCarDetail> getCarVendorSelect() {
		return carMapper.getCarVendorSelect();
	}
	
	/**
	 * 차량 국가 선택 메서드
	 * @return
	 */
	public List<VoCarDetail> getCarOriginSelect() {
		return carMapper.getCarOriginSelect();
	}
	
	//차량 수정 조회 메서드
	public VoCarRegister getCarUpdate(String cuscar) {
		
		
		return carMapper.getCarUpdate(cuscar);
	}
	
	/**
	 * 차량 리스트 메서드
	 * @return
	 */
	public List<VoCarRegister> getCarList() {
	return carMapper.getCarList();
	}
	
	//받은 매개변수로 다른 메서드를 호출한다 이때 내가 받은 매개변수를 대입한다
	/**
	 * 차량 등록 메서드
	 * @param vcreg
	 * @return
	 */
	public int getCarInsert(VoCarRegister vcreg) {
		
		return carMapper.getCarInsert(vcreg);
		
		
	}
}
