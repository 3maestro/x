package com.cafe24.radev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.radev.service.CarService;
import com.cafe24.radev.vo.VoCarRegister;

@Controller
public class CarController {
	
	//get방식은 값을 지정해서 보내줄때 사용
	//post방식은 지정한 값을 한방에 보내줄때 사용
	
	@Autowired	private CarService carService;

	@GetMapping("carUpdate")
	public String carUpdate(@RequestParam(value="cus", required = false)String cuscar) {
		System.out.println(cuscar + "값확인");
		
		return "carregister/carUpdate";
		
	}
	
	@PostMapping("carRegister")
	public String carRegister(VoCarRegister vcreg) {
		System.out.println(vcreg + "차량등록 값 확인");
		
		carService.getCarInsert(vcreg);
		
		return "redirect:carList";
		
	}
	
	@GetMapping("carRegister")
	public String carRegister(Model model) {
		
		System.out.println(model + "@#@#@#@#@@##@#@@##@@@@@333333333333");
		return "carregister/carRegister";
	}
	
	@GetMapping("/carList")
	public String carList(VoCarRegister vcreg, Model model) {

		List<VoCarRegister> List = carService.getCarList();
		System.out.println("값확인" + List);
		model.addAttribute("vcreg", List); //어트리뷰트 : 어딘가에 등록이 되어있다
		return "carregister/carList";
		
	}
	
	


}
