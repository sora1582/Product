package com.itheima.product.domain;

import java.util.Date;

public class User {
	private int id; // �û����
	private String username; // �û�����
	private String password; // �û�����
	private String gender; // �û��Ա�
	private String email; // �û�����
	private String telephone; // �û���ϵ�绰
	private String introduce; // �û�����
	private String activeCode; // ������
	private String role; // �û���ɫ
	private int state; // �û�״̬
	private Date registTime;// ע��ʱ��
	
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
