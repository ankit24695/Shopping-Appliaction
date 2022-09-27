package com.shopping.module;

public class Category {

	private Integer categortId;
	private String categoryName;
	
	
	
	public Category() {
		
	}



	public Category(Integer categortId, String categoryName) {
		super();
		this.categortId = categortId;
		this.categoryName = categoryName;
	}



	public Integer getCategortId() {
		return categortId;
	}



	public void setCategortId(Integer categortId) {
		this.categortId = categortId;
	}



	public String getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	
	
	
	
}
