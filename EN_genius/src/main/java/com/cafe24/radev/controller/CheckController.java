package com.cafe24.radev.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.radev.service.CheckService;
import com.cafe24.radev.vo.Check;
import com.cafe24.radev.vo.RoutineCheck;

@Controller
public class CheckController {

	@Autowired private CheckService checkService;
	
	@GetMapping("/routineCheckList")
	public String routineCheckList(Model model) {
		System.out.println("routineCheckList CheckController 호출");
		
		List<RoutineCheck> list = checkService.getRoutineCheckList();
		model.addAttribute("routineCheckList", list);
		
		return "/check/routineCheckList";
	}
	
	@PostMapping("/askCheck")
	public @ResponseBody List<String> askCheck(
			@RequestParam(value="check[]", required = false) List<String> check, String car) {
		System.out.println("askCheck CheckController 호출");
		System.out.println(check + " <-check askCheck CheckController.java");
		System.out.println(car + " <-car askCheck CheckController.java");
		
		List<String> list = new ArrayList<String>();
		list = checkService.getAskCheck(check, car);
		System.out.println(list + " <-re askCheck CheckController.java");
		
		return list;
	}
	
	@GetMapping("/basicCheckList")
	public String basicCheckList() {
		System.out.println("basicCheckList CheckController 호출");
		return "/check/basicCheckList";
	}
	
	//@ResponseBody Map<String, Object>
	//@ResponseBody List<Map<String, Object>>
	@GetMapping("/diagnosisGuide") 
	public String checkList() {
		System.out.println("checkList CheckController 호출");
		return "/check/diagnosisGuide";
	}
	 
	@PostMapping(value="/checkList", produces = "application/json")
	public @ResponseBody List<Map<String, Object>> checkList(
			 @RequestParam(value="bigcate", defaultValue = "engine", required=false) String bigcate) {
		
		System.out.println("checkList 오버로딩 CheckController 호출"); 
		System.out.println("대분류 : " + bigcate);
		 
		List<Map<String, Object>> checkMap = checkService.getCheckList(bigcate);
		System.out.println(checkMap + " <-checkMap checkList CheckController.java");
		 

		return checkMap;
	}
 
}
