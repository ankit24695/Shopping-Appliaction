package com.shopping.module;

public class Category {

	private int categortId;
	private String categoryName;
	
	
	
	public Category() {
		
	}



	public Category(int categortId, String categoryName) {
		super();
		this.categortId = categortId;
		this.categoryName = categoryName;
	}



	public int getCategortId() {
		return categortId;
	}



	public void setCategortId(int categortId) {
		this.categortId = categortId;
	}



	public String getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	
}
