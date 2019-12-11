package com.cafe24.radev.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.Part;
@Mapper
public interface PartMapper {
	public List<Part> getPartList();
	public Part partSelectForOrder(String partNumber);
}
