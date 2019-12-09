package com.cafe24.radev.vo;

public class Check {
	
	private String ckBigName;
	private String ckMidName;
	private String ckBigCode;
	
	public String getCkBigName() {
		return ckBigName;
	}
	public void setCkBigName(String ckBigName) {
		this.ckBigName = ckBigName;
	}
	public String getCkMidName() {
		return ckMidName;
	}
	public void setCkMidName(String ckMidName) {
		this.ckMidName = ckMidName;
	}
	public String getCkBigCode() {
		return ckBigCode;
	}
	public void setCkBigCode(String ckBigCode) {
		this.ckBigCode = ckBigCode;
	}
	
	@Override
	public String toString() {
		return "Check [ckBigName=" + ckBigName + ", ckMidName=" + ckMidName + ", ckBigCode=" + ckBigCode + "]";
	}
		
}
