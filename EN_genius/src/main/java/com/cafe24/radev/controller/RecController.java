package com.cafe24.radev.controller;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.radev.vo.VoRecRegister;




@Controller
public class RecController {
	
	@GetMapping("repHistory")
	public String repHistory() {
		System.out.println("과거 정비 이력 조회");
		return "receptionregister/repHistory";
	}
	
	@GetMapping("carRecallInfo")
	public String carRecallInfo() {
		System.out.println("차량 리콜 조회");
		return "receptionregister/carRecallInfo";
	}
	
	
	@GetMapping("recRegister")
	public String register(Model model) {
		
		
		return "receptionregister/recRegister";
	}
	
	
	@PostMapping("recList")
	public String RecList(VoRecRegister vorecreg, Model model) {
			
		
		
		model.addAttribute("vorecreg", vorecreg);
			System.out.println(vorecreg +"차량 리스트 값 확인");
		
		
		return "receptionregister/recList";
	}
	
	@GetMapping("recList")
	public String RecList(Model model) {
			
		
		
		
		return "receptionregister/recList";
	}
	
	/* 작업지시서 샘플 만드는 중
	 * @GetMapping("dustmq") public String dustmq(Model model) {
	 * 
	 * 
	 * 
	 * 
	 * return "receptionregister/dustmq"; }
	 */
}
