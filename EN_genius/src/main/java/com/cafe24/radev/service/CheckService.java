package com.cafe24.radev.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CheckMapper;
import com.cafe24.radev.vo.Check;
import com.cafe24.radev.vo.RoutineCheck;

@Service
public class CheckService {

	@Autowired private CheckMapper checkMapper;
	
	
	public List<RoutineCheck> getRoutineCheckList(){
		System.out.println("getRoutineCheckList CheckService 호출");
		
		List<RoutineCheck> list = checkMapper.getRoutineCheckList();
		
		return list;
	}
	
	public List<Check> getCheckList(String bigcate){
		System.out.println("getCheckList CheckService 호출");
		System.out.println(bigcate + " <- checkBigCate getCheckList CheckService.java");
		List<Check> list = new ArrayList<Check>();
		list = checkMapper.getCheckList(bigcate);
		//System.out.println(list.get(1) + " <-list getCheckList CheckService.java");
		
		Map<String,String> map = null;
		for(int i=0; i<list.size(); i++) {
			map = new HashMap<String,String>();
			Check check = list.get(i);
			String bigCate = check.getCkBigName();
			String midCate = check.getCkMidName();
			map.put(bigCate , midCate );
			System.out.println(map.get(bigCate));
		}

		return null;
	}
	
}
