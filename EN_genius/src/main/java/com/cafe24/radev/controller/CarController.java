package com.cafe24.radev.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.radev.service.CarService;
import com.cafe24.radev.vo.VoCarDetail;
import com.cafe24.radev.vo.VoCarRegister;

@Controller
public class CarController {
	//등록버튼 누르기 전 Datail쪽 마무리 하기
	
	// get방식은 값을 지정해서 보내줄때 사용
	// post방식은 지정한 값을 한방에 보내줄때 사용

	@Autowired
	private CarService carService;
	
	


	/**
	 * 등록버튼 누르기 전 Datail쪽 마무리 해야됨
	 * @param voDetail
	 * @return
	 */
	@PostMapping("carRegister")
	public String carRegister(VoCarDetail voDetail) {
		System.out.println(voDetail + "차량등록 값 확인");

		carService.getDetailInsert(voDetail);
		return "redirect:carList";

	}

	@GetMapping("carRegister")
	public String VoCarDetail(Model originSelect, Model vendorSelect, Model carClassSelect,Model carModelSelect, Model yearCarSelect, Model voDetail, Model opGradeSelect) {
		// model에 키,값 형태로 올려준다.
		
		opGradeSelect.addAttribute("opGradeSelect", carService.getOpGradeSelect());
		yearCarSelect.addAttribute("yearCarSelect", carService.getYearCarSelect());
		carModelSelect.addAttribute("carModelSelect", carService.getCarModelSelect()); // 차량 모델
		carClassSelect.addAttribute("carClassSelect", carService.getCarClassSelect()); //차량 종류
		vendorSelect.addAttribute("vendorSelect", carService.getCarVendorSelect()); // 제작 업체
		originSelect.addAttribute("originSelect", carService.getCarOriginSelect()); // 차량 국가
		System.out.println(vendorSelect + "제작 회사 선택");
		System.out.println(originSelect + "차량 국가 선택");
		return "carregister/carRegister";
	}

	
	// ajax 컨트롤러에서 받는 방법
	@PostMapping(value = "/test", produces = "application/json")
	public @ResponseBody String ajaxTest(@RequestParam Map<String, String> json) {
		String a = json.get("age");
		return a;
	}
	
	  @GetMapping("/carList")
	  public String carList(VoCarRegister vcreg, Model model) {
		  
	  List<VoCarRegister> List = carService.getCarList(); 
	  System.out.println("값확인"+ List); model.addAttribute("vcreg", List); //어트리뷰트 : 어딘가에 등록이 되어있다 
	  return "carregister/carList";
	  
	  }
	 

}
