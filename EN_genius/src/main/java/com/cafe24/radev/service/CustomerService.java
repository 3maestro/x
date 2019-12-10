package com.cafe24.radev.service;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.radev.mapper.CustomerMapper;
import com.cafe24.radev.vo.Customer;

@Service
@Transactional 
public class CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
//	public Map<String, Object> getMemberLogin(Customer cutomer) {
//		
//		String result = "";
//		
//		Map<String, Object> map = new HashMap<String,Object>();
//		
//		Customer memberCheck = memberMapper.getMemberLogin(cutomer);
//		
//		if(memberCheck == null) {
//			Customer memberIdCheck = memberMapper.getMemberById(
//					member.getMemberId());
//			if(memberIdCheck == null) {
//				result = "등록된 아이디의 정보가 없습니다.";
//			}else {
//				result = "비밀번호가 일치하지 않습니다.";
//			}
//
//		}else {
//			result = "로그인 성공";
//			map.put("loginMember", memberCheck);
//		}
//		
//		map.put("result", result);
//		
//		return map;
//	}
	
	public List<Customer> getCustomerList(){
		List<Customer> list = customerMapper.getCustomerList();
		return list;
	}
//	
//	public List<Customer> getMemberSearchList(String sk, String sv){
//		List<Customer> list = memberMapper.getMemberSearchList(sk, sv);
//		
//		return list;
//	}
//	
//	public int addMember(Customer member) {
//		int result = memberMapper.addMember(member);
//		return result;
//	}
//	
//	public Customer getMemberById(String memberId) {
//		
//		return memberMapper.getMemberById(memberId);
//	}
//	
//	public int modifyMember(Customer member) {
//		return memberMapper.modifyMember(member);
//	}
//	
//	public int deleteMember(String memberId, String memberPw) {
//		return memberMapper.delMember(memberId, memberPw);
//	}
	
}
