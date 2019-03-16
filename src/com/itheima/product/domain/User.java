package com.itheima.product.domain;

import java.util.Date;

public class User {
	private int id; // 用户编号
	private String username; // 用户姓名
	private String password; // 用户密码
	private String gender; // 用户性别
	private String email; // 用户邮箱
	private String telephone; // 用户联系电话
	private String introduce; // 用户介绍
	private String activeCode; // 激活码
	private String role; // 用户角色
	private int state; // 用户状态
	private Date registTime;// 注册时间
	
	public void setId(int id) {
		this.id =id;
	}
	public int getId() {
		return id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String Password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}
	public String getActiveCode() {
		return activeCode;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getState() {
		return state;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public Date getRegistTime() {
		return registTime;
	}
	
}
