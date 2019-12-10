package com.cafe24.radev.vo;

public class Customer {
	private String customer_code;
	private String bs_code;
	private String ei_code;
	private String customer_sign;
	private String customer_name;
	private String customer_birth;
	private String customer_gender;
	private String customer_addr;
	private String customer_phone;
	private String customer_memo;
	
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	
	public String getBs_code() {
		return bs_code;
	}
	public void setBs_code(String bs_code) {
		this.bs_code = bs_code;
	}
	
	public String getEi_code() {
		return ei_code;
	}
	public void setEi_code(String ei_code) {
		this.ei_code = ei_code;
	}
	
	public String getCustomer_sign() {
		return customer_sign;
	}
	public void setCustomer_sign(String customer_sign) {
		this.customer_sign = customer_sign;
	}
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public String getCustomer_birth() {
		return customer_birth;
	}
	public void setCustomer_birth(String customer_birth) {
		this.customer_birth = customer_birth;
	}
	
	public String getCustomer_gender() {
		return customer_gender;
	}
	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}
	
	public String getCustomer_addr() {
		return customer_addr;
	}
	public void setCustomer_addr(String customer_addr) {
		this.customer_addr = customer_addr;
	}
	
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	
	public String getCustomer_memo() {
		return customer_memo;
	}
	public void setCustomer_memo(String customer_memo) {
		this.customer_memo = customer_memo;
	}
	
	@Override
	public String toString() {
		return "Customer [customer_code=" + customer_code + ", bs_code=" + bs_code + ", ei_code=" + ei_code
				+ ", customer_sign=" + customer_sign + ", customer_name=" + customer_name + ", customer_birth="
				+ customer_birth + ", customer_gender=" + customer_gender + ", customer_addr=" + customer_addr
				+ ", customer_phone=" + customer_phone + ", customer_memo=" + customer_memo + "]";
	}
}
