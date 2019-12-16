package com.cafe24.radev.mapper;

<<<<<<< HEAD
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.VoCarRegister;
import com.cafe24.radev.vo.VoRecRegister;

@Mapper
public interface RecMapper {
	/**
	 * 접수 리스트 맵퍼
	 * @return
	 */
	public List<VoRecRegister> getRecList();
	
		
	
	/**
	 * 접수 등록 맵퍼
	 * @return
	 */
	public int getRecInsert(VoRecRegister vcreg);
=======
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.VoCarRegister;

@Mapper
public interface RecMapper {

	//접수 리스트 맵퍼
	public List<VoCarRegister> getRecList();
	
		
	
	//접수 등록 맵퍼
	public int getRecInsert(VoCarRegister vcreg);
>>>>>>> refs/heads/jsh
	
	
}
