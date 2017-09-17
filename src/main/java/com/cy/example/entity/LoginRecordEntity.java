package com.cy.example.entity;

import org.springframework.stereotype.Repository;

@Repository
public class LoginRecordEntity extends BaseEntity{

	private String c_loginIp;
	
	private String c_username;
	
	
	public String getC_username() {
		return c_username;
	}

	public void setC_username(String c_username) {
		this.c_username = c_username;
	}

	public String getC_loginIp() {
		return c_loginIp;
	}

	public void setC_loginIp(String c_loginIp) {
		this.c_loginIp = c_loginIp;
	}
	
	
}
