package com.shopping.module;

public class CustomerDTO {

	private Integer userId;
	private String password;
	
	
	
	public CustomerDTO() {
		
	}



	public CustomerDTO(Integer userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}



	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
