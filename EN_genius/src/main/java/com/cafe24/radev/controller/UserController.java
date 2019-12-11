package com.cafe24.radev.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.radev.service.UserService;
import com.cafe24.radev.vo.CarFactory;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("/CarFactoryInsert")
	public String addCarFactory() {
		return "/carfactory/addCarFactory";
	}
		
	@PostMapping("/CarFactoryInsert") 
	public String addCarFactory( CarFactory carFactory
								,@RequestParam("bs_docu") MultipartFile bs_docu
								,RedirectAttributes redirectAttributes){
		/*
		 * System.out.println("carFactory ==> " + carFactory.toString());
		 * 
		 * int r = userService.addCarFactory(carFactory, bs_docu); System.out.println(r
		 * + "r 결과 값");
		 */
		return "redirect:/index";
	}
	@GetMapping("/employeeInsert")	//직원등록
	public String addEmployee() {
		return "/employee/EmployeeInsert";
	}
	@GetMapping("/employeeSelect")	//직원조회
	public String selectEmployee() {
		return "/employee/EmployeeSelect";
	}
	@GetMapping("/workCurrentState")	//직원작업현황
	public String WorkCurrentState() {
		return "/employee/EmployeeWorkCurrentState";
	}
	@GetMapping("/statistics")	//직원별통계
	public String Statistics() {
		return "/employee/EmployeeStatistics";
	}
	@GetMapping("/loginForm")		//로그인폼
	public String loingForm() {
		return "/login/login";
	}
	@GetMapping("/Adminlogin")		//관리자로그인
	public String adminLogin() {
		return "/index";
	}
	@GetMapping("/Bosslogin")		//사장님로그인
	public String bossLogin() {
		return "/index";
	}
	@GetMapping("/Employeelogin")	//직원로그인
	public String employeeLogin() {
		return "/index";
	}
}
