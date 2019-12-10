package com.cafe24.radev.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.voCarRegister;

import java.util.List;

@Mapper
public interface CarMapper {
	
	public List<voCarRegister> getCarList();

	public String getCarInsert();

}
