package com.cafe24.radev.controller;

import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpSession;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.radev.service.CustomerService;
import com.cafe24.radev.vo.Customer;

@Controller
public class CustomerController {

//	private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired CustomerService customerService;
	
	@GetMapping("/customerList")
	public String getMemberList(Model model) {
		List<Customer> list = customerService.getCustomerList();
		
		model.addAttribute("customerList", list);
		
		return "/customer/customerList";
	}
//	
//	@PostMapping("/memberList")
//	public String getMemberList( @RequestParam(value="sk") String sk
//								,@RequestParam(value="sv") String sv
//								,Model model) {
//		List<Customer> list = memberService.getMemberSearchList(sk, sv);
//		model.addAttribute("memberList", list);
//		
//		return "/member/mlist/memberList";
//	}
//	
//	@GetMapping("/addMember")
//	public String addMember() {
//		return "/member/mInsert/addMember";
//	}
//	
//	@PostMapping("/addMember")
//	public String addMember(Customer member, Model model) {
//		System.out.println(member);
//		Customer memberCheck = memberService.getMemberById(member.getMemberId());
//		
//		if(memberCheck != null) {
//			model.addAttribute("result", "동일한 아이디가 존재합니다.");
//			return "/member/mInsert/addMember";
//		}
//		
//		memberService.addMember(member);
//		
//		return "redirect:/memberList";
//	}
//	
//	@GetMapping("/modifyMember")
//	public String modifyMember(@RequestParam(value="memberId")
//								String memberId, Model model) {
//		System.out.println(memberId + "<--memberId");
//		
//		model.addAttribute("member", memberService.getMemberById(memberId));
//		
//		return "/member/mUpdate/modifyMember";
//	}
//	
//	@PostMapping("/modifyMember")
//	public String modifyMember(Customer member) {
//		memberService.modifyMember(member);
//		return "redirect:/memberList";
//	}
//	
//	@GetMapping("/delMember")
//	public String delMember(@RequestParam(value="memberId")
//							String memberId, Model model) {
//		model.addAttribute("memberId", memberId);
//		
//		return "member/mdelete/delMember";
//	}
//	@PostMapping("/delMember")
//	public String delMember(Customer member,Model model) {
//		
//		int result = memberService.deleteMember(member.getMemberId(), 
//												member.getMemberPw());
//		
//		if(result == 0) {
//			model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
//			model.addAttribute("memberId", member.getMemberId());
//			return "member/mdelete/delMember";
//		}
//		
//		return "redirect:/memberList";
//	}
}
