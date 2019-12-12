package com.cafe24.radev.service;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.CheckMapper;
import com.cafe24.radev.vo.AskCheck;
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
	
	public List<String> getAskCheck(List<String> check, String car){
		System.out.println("getRoutineCheckList CheckService 호출");
		System.out.println("check getAskCheck CheckService.java -> " + check);
		System.out.println("car getAskCheck CheckService.java -> " + car);
		
		List<AskCheck> list = checkMapper.getAskCheck(car);
		System.out.println("list getAskCheck CheckService : " + list);
		
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		Calendar time = Calendar.getInstance();
		String date = format.format(time.getTime());
		System.out.println(date + "<-date getAskCheck CheckService.java");
		
		AskCheck ask = null;
		
		/**
		 *수리 내역중 정기점검 목록이 체그한 리스트보다 많을 때 
		 * 
		 */
		if(list.size() >= check.size()) {
			System.out.println("수리 내역중 정기점검 목록이 체크한 리스트(조회할 항목)보다 많거나 같을 때 ");
			for(int i=0; i<list.size(); i++) {
				for(int j=0; j<check.size(); j++){
					String getCheckCode = check.get(j);		
					ask = new AskCheck();
					ask = list.get(i);
					String getRiCode = ask.getRiCode();
					// 체크항목과 최근 정비 내역의 정기 점검 항목이 일치 하다면 
					if(getRiCode.equals(getCheckCode)) {
						System.out.println("01. 체크 항목과 최근 정비 내역의 정기점검 항목이 일치 하다면 ");
						
					}
				}
				
			}
			
		}else {
			System.out.println("체크한 리스트(조회할 항목)이 수리 내역중 정기점검 목록이 보다 많을 때 ");
			for(int i=0; i<check.size(); i++) {
				for(int j=0; j<list.size(); j++) {
					String getCheckCode = check.get(i);
					ask = new AskCheck();
					ask = list.get(j);
					String getRiCode = ask.getRiCode();
					// 체크 항목과 최근 정비 내역의 정기점검 항목이 일치 하다면 
					if(getCheckCode.equals(getRiCode)) {
						System.out.println("02. 체크 항목과 최근 정비 내역의 정기점검 항목이 일치 하다면 ");
					}
				}
			
				
			}
		
		}
		

		
		return null;
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