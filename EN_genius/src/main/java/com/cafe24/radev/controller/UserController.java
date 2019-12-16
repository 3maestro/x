package com.cafe24.radev.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.radev.service.UserService;
import com.cafe24.radev.vo.CarFactory;
import com.cafe24.radev.vo.Employee;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	/**
	 * 회원가입 클릭시 사업장등록 폼으로 이동
	 * @return
	 */
	@GetMapping("/CarFactoryInsert")
	public String addCarFactory() {
		return "/carfactory/carFactoryInsert";
	}
	
	/**
	 * 회원가입 폼에서 받아 온 값으로 처리과정	
	 * @param carFactory
	 * @param bs_docu
	 * @param redirectAttributes
	 * @return
	 */
	@PostMapping("/carFactoryInsert") 
	public String addCarFactory( CarFactory carFactory
								,@RequestParam("bs_docu") MultipartFile bs_docu
								){
		
		  System.out.println("carFactory ==> " + carFactory.toString());
		  System.out.println("파일====>" + bs_docu);
		  int r = userService.addCarFactory(carFactory);
		  System.out.println(r + "r 결과 값");
		  userService.addDocumentFile(bs_docu);
		 
		return "redirect:/index";
	}
	@GetMapping("/loginForm")		//로그인폼
	public String loingForm() {
		return "/login/login";
	}
	/**
	 * 사업장 리스트
	 * @return
	 */
	@GetMapping("/CarFactorySearch")
	public String carFactoryList(Model model) {
		userService.carFactoryList();
		model.addAttribute("carfactorylist", userService.carFactoryList());
		return "/carfactory/carFactoryList";
	}
	
	@GetMapping("/selectImage")
	public String selectImage(@RequestParam(value = "bsCode")String bsCode) {
		System.out.println("코드값" + bsCode);
		return "";
	}
/********************************************************************************************************로그인*/	
	/**
	 * 관리자 로그인처리
	 * @param carFactory
	 * @param session
	 * @param model
	 * @return
	 */
	@PostMapping("/Adminlogin")
	public String adminLogin(CarFactory carFactory, HttpSession session, Model model) {
		System.out.println(carFactory.toString());						
		Map<String,Object> map = userService.adminLogin(carFactory);
		String re = (String)map.get("re");
		CarFactory c = (CarFactory)map.get("login");	
		if(re != "login") {
			model.addAttribute("lo", re);
			//session.setAttribute("lo", re);
			return "/login/login";
		}else{
			session.setAttribute("SLEVEL", c.getLevel());
			session.setAttribute("SID", c.getBossId());
			session.setAttribute("SCODE", c.getBsCode());
			session.setAttribute("SWRITER", c.getBsWriter());
		}
		return "redirect:/";
	}

	/**
	 * 사장님 로그인처리
	 * @param carFactory
	 * @param session
	 * @return
	 */
	@PostMapping("/Bosslogin")
	public String bossLogin(CarFactory carFactory, HttpSession session) { 
		System.out.println(carFactory.toString());				
				
		Map<String,Object> map = userService.adminLogin(carFactory);
		System.out.println(userService.adminLogin(carFactory).toString()+"<<1번확인");
		String re = (String)map.get("re");
		CarFactory c = (CarFactory)map.get("login");
		
		if(re != "login") {
			session.setAttribute("lo", re);
			return "/login/login";
		}else{
			session.setAttribute("SID", c.getBossId());
			session.setAttribute("SCODE", c.getBsCode());
			session.setAttribute("SNAME", c.getBossName());
			session.setAttribute("SWRITER", c.getBsWriter());
		}
		return "redirect:/";
	} 

	/**
	 * 직원 로그인처리
	 * @param employee
	 * @param session
	 * @return
	 */
	@PostMapping("/Employeelogin")
	public String employeeLogin(Employee employee, HttpSession session) { 
		System.out.println(employee.toString()+"<-----test");				
		
		Map<String,Object> map = userService.employeeLogin(employee);
		System.out.println(userService.employeeLogin(employee).toString()+"<<1번확인");		
		String re = (String)map.get("re");
		Employee e = (Employee)map.get("login");
		
		if(re != "login") {
			session.setAttribute("lo", re);
			return "/index";
		}else{
			session.setAttribute("SCODE", e.getBsCode());
			session.setAttribute("ECODE", e.getEmployeeCode());
			session.setAttribute("SNAME", e.getEmployeeName());
		}
		return "redirect:/";
	}
 
	/**
	 * 로그아웃
	 * @param session
	 * @return
	 */
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	/**
	 * ajax로 id중복체크
	 * @param bossId
	 * @return
	 */
	@PostMapping(value = "/idCheckCall", produces = "application/json")
	public @ResponseBody String idCheckCall(
			@RequestParam(value = "bossId", defaultValue = "0", required = false)String bossId
			){
		System.out.println(bossId+"<<<<<<<<-paramr/ajax호출/컨트롤러");
		
		
		return null;
	}
}
