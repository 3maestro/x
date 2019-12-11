package com.cafe24.radev.service;

import java.util.*;

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
	
	public List<Map<String, Object>> getCheckList(String bigcate){
		System.out.println("getCheckList CheckService 호출");
		System.out.println(bigcate + " <-bigCate getCheckList CheckService.java");
		
		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
		
		List<Check> listCheck = checkMapper.getCheckList(bigcate);
		System.out.println(listCheck.size() + " <-사이즈 CheckService");
		
		//List<String> listMidName = new ArrayList<String>();
		Map<String, Object> mapMidName = null;
		
		for(int i=0; i<listCheck.size(); i++) {
			Check check = listCheck.get(i);
			String midName = check.getCkMidName();
			System.out.println(midName + " <-midName getCheckList CheckService.java");	
			mapMidName = new HashMap<String, Object>();
			mapMidName.put(bigcate, midName);
			
			listMap.add(mapMidName);
		}
		
		return listMap;
	}
	
}



//		List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
//		listMap = checkMapper.getCheckList(bigcate);
//		System.out.println(listMap.size() + " <-사이즈");
//		for(int i=0; i<listMap.size(); i++) {
//			Map<String,Object> map = null;
//			map = listMap.get(i);
//			map.put(bigcate, 34f);
////			System.out.println(map + " <-나오니?");
////			for(int j=0; j<map.size(); j++) {
////				Map<String,String> checkMap = new HashMap<String,String>();
////				Check check = map.get(j);
////				String midCate = check.getCkMidName();
////				String bigCate = check.getCkBigName();
//////				map.put(bigcate, midCate );
////				checkMap.put(bigCate , midCate);
////				System.out.println(checkMap.get(bigCate));
//////			}
//		}
//		
//