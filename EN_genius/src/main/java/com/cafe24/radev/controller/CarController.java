package com.cafe24.radev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.radev.service.CarService;
import com.cafe24.radev.vo.voCarRegister;

@Controller
public class CarController {
	
	@Autowired	private CarService carService;

	@GetMapping("carRegister")
	public String carRegister(Model model) {
		System.out.println(model + "@#@#@#@#@@##@#@@##@@@@@333333333333");
		return "carregister/carRegister";
	}
	
	@GetMapping("/carList")
	public String carList(voCarRegister vcreg, Model model) {

		List<voCarRegister> List = carService.getCarList();
		System.out.println("값확인" + List);
		model.addAttribute("vcreg", List);
		//System.out.println(vcreg + "@#@#@#@#@@##@#@@##@@@@@222222222");
		return "carregister/carList";
		
	}
	
	
	/* @PostMapping("carList") */
	/*public String carList(voCarRegister vcreg,Model model) {
	
		model.addAttribute("vcreg", vcreg);
		//System.out.println(model.toString() + "@#@#@#@#@@##@#@@##@@@@@1111111111");
		return "carregister/carList";
		
	}
	*/

}
