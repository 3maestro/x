package com.cafe24.radev.controller;

import java.util.List;


import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.radev.service.PartService;
import com.cafe24.radev.vo.Part;


@Controller
public class PartController {
	@Autowired private PartService partService;
	/**
	 * 통계 및 최근 구입,판매부품 표시관련
	 * @return
	 */
	@GetMapping("/partMain")
	public String partMain() {
		return "/part/partMain";
	}
	
	/**
	 * 부품목록(리스트)호출
	 * @param model
	 * @return
	 */
	@GetMapping("/partList")
	public String getPartList(Model model) {
		System.out.println("파트리스트/controller");
		
		model.addAttribute("partList", partService.getPartList());
		
		return "/part/partList";
	}
	/**
	 * 부품등록창호출
	 * 카테고리 대 분류 데이터호출
	 * @return
	 */
	@GetMapping("/partInsert")
	public String partCate(Model model) {
		System.out.println("부품등록(카테고리호출)/컨트롤러");
		
		model.addAttribute("fCateList", partService.selectFristDate());
		
		return"/part/partInsert";
	}
	/**
	 * ajax로 대분류에맞는 중분류값 호출
	 * @param fVal
	 * @return
	 */
	@PostMapping(value = "/sCateCall", produces = "application/json")
	public @ResponseBody List<String> sCateCall(
			@RequestParam(value = "fVal", defaultValue = "engine", required = false)String fVal
			){
		System.out.println("카테고리ajax호출/컨트롤러");
		System.out.println(fVal+"<-paramr/ajax호출/컨트롤러");
		
		
		return partService.selectSecondDate(fVal);
	}
	
	/**
	 * 부품등록처리
	 * @param parts
	 * @param session
	 * @return
	 */
	@PostMapping("/partInsert")
	public String insertParts(Part parts, HttpSession session) {
		//등록자입력을 위한 세션값
		//String id = (String)session.getAttribute("userId");
		
		
		return"redirect:/part/partList";
	}
	/**
	 * 부품주문호출
	 * 파트번호하나로 한로우조회
	 * 리스트목록에서 주문으로 넘어갈때
	 * @param model
	 * @return
	 */
	@GetMapping("/partOrderToList")
	public String partSelectForOrder(Model model,@RequestParam(value ="partNumber") String partNumber) {
		System.out.println(partNumber+"<select for order/controller");
		
		model.addAttribute("partRow", partService.partSelectForOrder(partNumber));
		
		return "/part/partOrder";
	}
	/**
	 * 부품주문호출
	 * 신규부품 주문시
	 * @param model
	 * @return
	 */
	@GetMapping("/partOrder")
	public String partorder(Model model) {
		
		return "/part/partOrder";
	}
	/**
	 * 부품목록에서 부품견적
	 * 사용파트넘버가지고이동
	 * @return
	 */
	@GetMapping("/partEstimateToList")
	public String setPartEstimateToList(Model model,@RequestParam(value = "partCheck") String partCheck) {
		System.out.println(partCheck+"<<푸붐체크값");
		return "/part/partEstimate";
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/partEstimate")
	public String setPartEstimate() {
		
		return "/part/partEstimate";
	}
	
}
