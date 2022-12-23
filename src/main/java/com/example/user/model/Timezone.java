package com.example.user.model;

public class Timezone {

	public String offset;
    public String description;
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Timezone [offset=" + offset + ", description=" + description + "]";
	}
	public Timezone(String offset, String description) {
		super();
		this.offset = offset;
		this.description = description;
	}
	public Timezone() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
