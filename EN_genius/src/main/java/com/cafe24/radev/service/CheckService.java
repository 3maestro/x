package com.cafe24.radev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CheckMapper;
import com.cafe24.radev.vo.RoutineCheck;

@Service
public class CheckService {

	@Autowired private CheckMapper checkMapper;
	
	
	public List<RoutineCheck> getRoutineCheckList(){
		System.out.println("getRoutineCheckList CheckService 호출");
		
		List<RoutineCheck> list = checkMapper.getRoutineCheckList();
		
		return list;
	}
	
	public List<?> getCheckList(String checkBigCate){
		System.out.println("getCheckList CheckService 호출");
		System.out.println(checkBigCate + " <- checkBigCate getCheckList CheckService.java");
		
		checkMapper.getCheckList();
		
		
		return null;
	}
	
}
