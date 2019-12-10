package com.cafe24.radev.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.voCarRegister;

import java.util.List;

@Mapper
public interface CarMapper {
	
	//가져갈 값이 1개일땐 리턴데이터 타입을 vo객체로 한다
	public voCarRegister getCarUpdate(String cuscar);
	//차량 리스트 메서드
	public List<voCarRegister> getCarList();

	//차량 등록 메서드
	//등록할떄마다 값을 가져와야 하기 떄문에 vo의 매개변수를 입력해야 한다
	public int getCarInsert(voCarRegister vcreg);

}
