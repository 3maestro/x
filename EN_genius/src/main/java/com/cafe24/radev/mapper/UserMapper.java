package com.cafe24.radev.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cafe24.radev.vo.CarFactory;

@Mapper
public interface UserMapper {

	int addCarFactory(CarFactory carFactory, String realFilename, long filesize);
}
