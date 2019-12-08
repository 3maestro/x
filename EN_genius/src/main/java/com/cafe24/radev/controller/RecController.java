package com.cafe24.radev.controller;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.radev.vo.voRecRegister;




@Controller
public class RecController {
	
	
	@GetMapping("recRegister")
	public String register(Model model) {
		
		return "receptionregister/recRegister";
	}
	
	
	@PostMapping("recList")
	public String RecList(voRecRegister vorecreg, Model model) {
			
		
		
		model.addAttribute("vorecreg", vorecreg);
			System.out.println(vorecreg +"<-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		return "receptionregister/recList";
	}
	
	@GetMapping("recList")
	public String RecList(Model model) {
			
		
		
		
		return "receptionregister/recList";
	}
}
