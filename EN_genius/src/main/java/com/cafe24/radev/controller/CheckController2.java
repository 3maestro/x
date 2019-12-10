package com.cafe24.radev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckController2 {

	@GetMapping("/checkList2")
	public String checkList() {
		System.out.println("checkList CheckController 호출");
		
		
		return "/check/checkList";
	}
	
}
