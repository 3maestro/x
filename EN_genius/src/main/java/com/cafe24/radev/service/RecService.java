package com.cafe24.radev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.radev.mapper.RecMapper;
import com.cafe24.radev.vo.VoCarRegister;

@Service
public class RecService {
	
	@Autowired private RecMapper recMapper;
	public List<VoCarRegister> getRecList() {
		return recMapper.getRecList();
	}
	
	public int getRecInsert(VoCarRegister vcreg) {
		
		return getRecInsert(vcreg);
		
	}
}
