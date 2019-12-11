package com.cafe24.radev.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.radev.service.CheckService;
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
	
	
	 @GetMapping("/checkList") 
	 public String checkList(HttpServletRequest request, Model model) {
		 System.out.println("checkList CheckController 호출");
		 
		 String bigcate = request.getParameter("bigcate");
		 System.out.println("대분류 : " + bigcate);
		 
		 checkService.getCheckList(bigcate);
		 
		 return "/check/checkList"; 
	 }
	 

}
