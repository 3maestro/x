package com.cafe24.radev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.radev.vo.voCarRegister;

@Controller
public class CarController {
	
	@GetMapping("carRegister")
	public String carRegister(Model model) {
		
		return "carregister/carRegister";
	}
	
	@GetMapping("carList")
	public String carList(voCarRegister vcreg,Model model) {
	
		return "carregister/carList";
		
	}
	
	@PostMapping("carList")
	public String carList(Model model) {
		return "carregister/carList";
		
	}
	

}
