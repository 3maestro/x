package com.cafe24.radev.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.radev.vo.VoCarRegister;

import java.util.List;

@Mapper
public interface CarMapper {
	
	//가져갈 값이 1개일땐 리턴데이터 타입을 vo객체로 한다
	//차량 등록 수정 메서드
	public VoCarRegister getCarUpdate(String cuscar);
	//차량 리스트 메서드
	public List<VoCarRegister> getCarList();

	//등록할떄마다 값을 가져와야 하기 떄문에 vo의 매개변수를 입력해야 한다
	//차량 등록 메서드
	public int getCarInsert(VoCarRegister vcreg);

}
