package com.cafe24.radev.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CategoryForCarMapper;
import com.cafe24.radev.mapper.PartMapper;
import com.cafe24.radev.vo.FirstCategoryForCar;
import com.cafe24.radev.vo.Part;
import com.cafe24.radev.vo.SecondCategoryForCar;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer;

@Service
public class PartService {
	@Autowired private PartMapper partMapper;
	@Autowired private CategoryForCarMapper categoryMapper;
	/**
	 * 부품전체목록조회
	 * @return
	 */
	public List<Part> getPartList(){
		
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
	 * 부품등록시 중분류선택을 위한 데이터조회(Ajax)
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
	/**
	 * 신규부품등록
	 * @param parts
	 */
	public void partInsertPro(Part parts) {
		//수정자아이디
		String partWrite = "id002";
		//수정공업사코드
		String factory = "cp002";
		System.out.println("partInsertPro/Service");
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
		Calendar time = Calendar.getInstance();
		String partUpdateDate = format.format(time.getTime());
		
		System.out.println(partUpdateDate+"<<현재시간/service");
		
		parts.setPartWrite(partWrite);
		parts.setPartUpdateDate(partUpdateDate);
		parts.setFactory(factory);
		
		partMapper.partInsertPro(parts);
	}
	/**
	 * 부품수량업데이트
	 */
	public void partUpdateforMany(Part part) {
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
		Calendar time = Calendar.getInstance();
		//수정자아이디
		String partWrite = "id002";
		String partUpdateDate = format.format(time.getTime());
		
		System.out.println(partUpdateDate+"<<현재시간/service");
		
		part.setPartWrite(partWrite);
		part.setPartUpdateDate(partUpdateDate);
		
		
		partMapper.partUpdateforMany(part);
	}
	/**
	 * 
	 * @param checkArray
	 */
	public void getCheckGroup(String checkArray) {
		
		System.out.println("getCheckGroup/service");
	}
	
}