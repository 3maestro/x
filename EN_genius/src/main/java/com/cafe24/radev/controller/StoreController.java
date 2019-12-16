package com.cafe24.radev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StoreController {
	
	/**
	 * 거래처 목록
	 * @return
	 */
	@GetMapping("/storeList")
	public String getStoreList() {
		return "/store/storeList";
	}
	/**
	 * 거래처
	 * 등록폼으로 이동 
	 * @return
	 */
	@GetMapping("/storeInsert")
	public  String storeInsert() {
		return "/store/storeInsert";
	}
	/**
	 * 거래처
	 * 등록처리
	 * @return
	 */
	@PostMapping("/storeInsert")
	public  String setStoreInsert() {
		return "redirect:/storeList";
	}
	
}
