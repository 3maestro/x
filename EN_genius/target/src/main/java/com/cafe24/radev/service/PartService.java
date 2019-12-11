package com.cafe24.radev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CategoryForCarMapper;
import com.cafe24.radev.mapper.PartMapper;
import com.cafe24.radev.vo.FirstCategoryForCar;
import com.cafe24.radev.vo.Part;
import com.cafe24.radev.vo.SecondCategoryForCar;

@Service
public class PartService {
	@Autowired private PartMapper partMapper;
	@Autowired private CategoryForCarMapper categoryMapper;
	/**
	 * 부품전체목록조회
	 * @return
	 */
	public List<Part> getPartList(){
		System.out.println("partList/Service");
		List<Part> partList = new ArrayList<Part>();
		partList = partMapper.getPartList();
		Part list = partList.get(0);
		String partNumber = list.getPartNumber();
		System.out.println(partNumber+"<-파트번호/service");
		
		return partMapper.getPartList();
	}
	/**
	 * 목록에서 리스트로 이동시 따라가는정보
	 * 로우하나 조회
	 * @param partNumber
	 * @return
	 */
	public Part partSelectForOrder(String partNumber) {
		System.out.println("partSelectForOrder/Service");
		
		return partMapper.partSelectForOrder(partNumber);
	}
	/**
	 * 부품등록시 대분류선택을 위한 데이터조회 
	 * @return
	 */
	public List<FirstCategoryForCar> selectFristDate(){
		System.out.println("대분류목록/service");
		
		return categoryMapper.getFirstCateList();
	}
	/**
	 * 부품등록시 중분류선택을 위한 데이터조회
	 * @return
	 */
	public List<String> selectSecondDate(String fVal){
		System.out.println("중분류목록/service");
		List<SecondCategoryForCar> sCateList = new ArrayList<SecondCategoryForCar>();
		List<String> sCateNameList = new ArrayList<String>();
		sCateList = categoryMapper.getSecondCateList(fVal);
		for(int i=0; i<sCateList.size(); i++) {
			SecondCategoryForCar sCateVO = sCateList.get(i);
			String sCate = sCateVO.getSecondCateName();
			sCateNameList.add(sCate);
		}
		
		return sCateNameList;
	}
}
