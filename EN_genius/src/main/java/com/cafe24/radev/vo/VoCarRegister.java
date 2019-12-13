package com.cafe24.radev.vo;

public class VoCarRegister {

	
	private String customerCarInfoCode; // 공업사사업장코드(FK)
	private String customerCarNumber; // 차량번호
	private String carProductionYear; // 생산연식
	private String carRegistrationDate; // 자동차등록일
	private String lastDistanceDriven; // 마지막방문시주행거리
	private String lastVisitDate; //마지막방문날짜
	private String customerCarInfoWriter; //작성자
	private String customerCarInfoDate; // 작성일자
	private String groupCode; // 그룹코드
	
	public String getCustomerCarInfoCode() {
		return customerCarInfoCode;
	}
	public void setCustomerCarInfoCode(String customerCarInfoCode) {
		this.customerCarInfoCode = customerCarInfoCode;
	}
	public String getCustomerCarNumber() {
		return customerCarNumber;
	}
	public void setCustomerCarNumber(String customerCarNumber) {
		this.customerCarNumber = customerCarNumber;
	}
	public String getCarProductionYear() {
		return carProductionYear;
	}
	public void setCarProductionYear(String carProductionYear) {
		this.carProductionYear = carProductionYear;
	}
	public String getCarRegistrationDate() {
		return carRegistrationDate;
	}
	public void setCarRegistrationDate(String carRegistrationDate) {
		this.carRegistrationDate = carRegistrationDate;
	}
	public String getLastDistanceDriven() {
		return lastDistanceDriven;
	}
	public void setLastDistanceDriven(String lastDistanceDriven) {
		this.lastDistanceDriven = lastDistanceDriven;
	}
	public String getLastVisitDate() {
		return lastVisitDate;
	}
	public void setLastVisitDate(String lastVisitDate) {
		this.lastVisitDate = lastVisitDate;
	}
	public String getCustomerCarInfoWriter() {
		return customerCarInfoWriter;
	}
	public void setCustomerCarInfoWriter(String customerCarInfoWriter) {
		this.customerCarInfoWriter = customerCarInfoWriter;
	}
	public String getCustomerCarInfoDate() {
		return customerCarInfoDate;
	}
	public void setCustomerCarInfoDate(String customerCarInfoDate) {
		this.customerCarInfoDate = customerCarInfoDate;
	}
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	
	@Override
	public String toString() {
		return "VoCarRegister [customerCarInfoCode=" + customerCarInfoCode + ", customerCarNumber=" + customerCarNumber
				+ ", carProductionYear=" + carProductionYear + ", carRegistrationDate=" + carRegistrationDate
				+ ", lastDistanceDriven=" + lastDistanceDriven + ", lastVisitDate=" + lastVisitDate
				+ ", customerCarInfoWriter=" + customerCarInfoWriter + ", customerCarInfoDate=" + customerCarInfoDate
				+ ", groupCode=" + groupCode + "]";
	}
	
	
	
}
