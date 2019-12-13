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
import com.cafe24.radev.vo.VoCarRegister;

@Controller
public class CarController {

	// get방식은 값을 지정해서 보내줄때 사용
	// post방식은 지정한 값을 한방에 보내줄때 사용

	@Autowired
	private CarService carService;


	@PostMapping("carRegister")
	public String carRegister(VoCarRegister vcreg) {
		System.out.println(vcreg + "차량등록 값 확인");

		carService.getCarInsert(vcreg);

		return "redirect:carList";

	}

	@GetMapping("carRegister")
	public String VoCarDetail(Model OriginSelect, Model VendorSelect, Model CarClassSelect,Model CarModelSelect, Model YearCarSelect) {
		// model에 키,값 형태로 올려준다.
		YearCarSelect.addAttribute("YearCarSelect", carService.getYearCarSelect());
		CarModelSelect.addAttribute("CarModelSelect", carService.getCarModelSelect()); // 차량 모델
		CarClassSelect.addAttribute("CarClassSelect", carService.getCarClassSelect()); //차량 종류
		VendorSelect.addAttribute("VendorSelect", carService.getCarVendorSelect()); // 제작 업체
		OriginSelect.addAttribute("OriginSelect", carService.getCarOriginSelect()); // 차량 국가
		System.out.println(VendorSelect + "제작 회사 선택");
		System.out.println(OriginSelect + "차량 국가 선택");
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
