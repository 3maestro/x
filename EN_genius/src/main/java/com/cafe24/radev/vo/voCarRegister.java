package com.cafe24.radev.vo;

public class voCarRegister {

	private String customerCarInfoCode;
	private String bsCode;
	private String customerCode;
	private String customerCarNumber;
	private String rcCode;
	private String vendorCode;
	private String carProductionYear;
	private String carRegistrationDate;
	private String lastDistanceDriven;
	private String lastVisitDate;
	private String customerCarInfoWriter;
	private String customerCarInfoDate;
	
	public String getCustomerCarInfoCode() {
		return customerCarInfoCode;
	}
	public void setCustomerCarInfoCode(String customerCarInfoCode) {
		this.customerCarInfoCode = customerCarInfoCode;
	}
	public String getBsCode() {
		return bsCode;
	}
	public void setBsCode(String bsCode) {
		this.bsCode = bsCode;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerCarNumber() {
		return customerCarNumber;
	}
	public void setCustomerCarNumber(String customerCarNumber) {
		this.customerCarNumber = customerCarNumber;
	}
	public String getRcCode() {
		return rcCode;
	}
	public void setRcCode(String rcCode) {
		this.rcCode = rcCode;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
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
	@Override
	public String toString() {
		return "voCarRegister [customerCarInfoCode=" + customerCarInfoCode + ", bsCode=" + bsCode + ", customerCode="
				+ customerCode + ", customerCarNumber=" + customerCarNumber + ", rcCode=" + rcCode + ", vendorCode="
				+ vendorCode + ", carProductionYear=" + carProductionYear + ", carRegistrationDate="
				+ carRegistrationDate + ", lastDistanceDriven=" + lastDistanceDriven + ", lastVisitDate="
				+ lastVisitDate + ", customerCarInfoWriter=" + customerCarInfoWriter + ", customerCarInfoDate="
				+ customerCarInfoDate + "]";
	}
	
	
	
}
