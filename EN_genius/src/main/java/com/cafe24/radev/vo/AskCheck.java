package com.cafe24.radev.vo;

public class AskCheck {
	private String customerCarInfoCode;
	private String riCode;
	private String riItem;
	private String askRepairDate;
	private String periodCycle;
	private String nowDate;
	
	public String getCustomerCarInfoCode() {
		return customerCarInfoCode;
	}
	public void setCustomerCarInfoCode(String customerCarInfoCode) {
		this.customerCarInfoCode = customerCarInfoCode;
	}
	public String getRiCode() {
		return riCode;
	}
	public void setRiCode(String riCode) {
		this.riCode = riCode;
	}
	public String getRiItem() {
		return riItem;
	}
	public void setRiItem(String riItem) {
		this.riItem = riItem;
	}
	public String getAskRepairDate() {
		return askRepairDate;
	}
	public void setAskRepairDate(String askRepairDate) {
		this.askRepairDate = askRepairDate;
	}
	public String getPeriodCycle() {
		return periodCycle;
	}
	public void setPeriodCycle(String periodCycle) {
		this.periodCycle = periodCycle;
	}
	
	@Override
	public String toString() {
		return "AskCheck [customerCarInfoCode=" + customerCarInfoCode + ", riCode=" + riCode + ", riItem=" + riItem
				+ ", askRepairDate=" + askRepairDate + ", periodCycle=" + periodCycle + "]";
	}
	
	

}
