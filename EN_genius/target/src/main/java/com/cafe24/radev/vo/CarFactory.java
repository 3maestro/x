package com.cafe24.radev.vo;

import org.springframework.web.multipart.MultipartFile;

public class CarFactory {

	private String boss_id;
	private String boss_pw;
	private String boss_name;
	private String bs_name;
	private String bs_num;
	private String bs_addr;
	private String bs_telephone;
	private String boss_phonenum;
	private String boss_email;
	private String bs_registration;
	public String getBoss_id() {
		return boss_id;
	}
	public void setBoss_id(String boss_id) {
		this.boss_id = boss_id;
	}
	public String getBoss_pw() {
		return boss_pw;
	}
	public void setBoss_pw(String boss_pw) {
		this.boss_pw = boss_pw;
	}
	public String getBoss_name() {
		return boss_name;
	}
	public void setBoss_name(String boss_name) {
		this.boss_name = boss_name;
	}
	public String getBs_name() {
		return bs_name;
	}
	public void setBs_name(String bs_name) {
		this.bs_name = bs_name;
	}
	public String getBs_num() {
		return bs_num;
	}
	public void setBs_num(String bs_num) {
		this.bs_num = bs_num;
	}
	public String getBs_addr() {
		return bs_addr;
	}
	public void setBs_addr(String bs_addr) {
		this.bs_addr = bs_addr;
	}
	public String getBs_telephone() {
		return bs_telephone;
	}
	public void setBs_telephone(String bs_telephone) {
		this.bs_telephone = bs_telephone;
	}
	public String getBoss_phonenum() {
		return boss_phonenum;
	}
	public void setBoss_phonenum(String boss_phonenum) {
		this.boss_phonenum = boss_phonenum;
	}
	public String getBoss_email() {
		return boss_email;
	}
	public void setBoss_email(String boss_email) {
		this.boss_email = boss_email;
	}
	
	public String getBs_registration() {
		return bs_registration;
	}
	public void setBs_registration(String bs_registration) {
		this.bs_registration = bs_registration;
	}
	
	
	@Override
	public String toString() {
		return "CarFactory [boss_id=" + boss_id + ", boss_pw=" + boss_pw + ", boss_name=" + boss_name + ", bs_name="
				+ bs_name + ", bs_num=" + bs_num + ", bs_addr=" + bs_addr + ", bs_telephone=" + bs_telephone
				+ ", boss_phonenum=" + boss_phonenum + ", boss_email=" + boss_email + ", bs_registration="
				+ bs_registration + "]";
	}
	
}
