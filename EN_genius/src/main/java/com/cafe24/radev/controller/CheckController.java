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
	
	@GetMapping("/basicCheckList")
	public String basicCheckList() {
		return "/check/basicCheckList";
	}
	
	//@ResponseBody Map<String, Object>
	//@ResponseBody List<Map<String, Object>>
	@GetMapping("/diagnosisGuide") 
	public String checkList() {
		return "/check/diagnosisGuide";
	}
	 
	@PostMapping(value="/checkList", produces = "application/json")
	public @ResponseBody List<Map<String, Object>> checkList(
			 @RequestParam(value="bigcate", defaultValue = "engine", required=false) String bigcate) {
		
		System.out.println("checkList CheckController 호출"); 
		System.out.println("대분류 : " + bigcate);
		 
		List<Map<String, Object>> checkMap = checkService.getCheckList(bigcate);
		System.out.println(checkMap + " <-checkMap checkList CheckController.java");
		 

		return checkMap;
	}
 
}
