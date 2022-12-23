package com.example.user.model;

public class Name {

	public String title;
    public String first;
    public String last;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@Override
	public String toString() {
		return "Name [title=" + title + ", first=" + first + ", last=" + last + "]";
	}
	public Name(String title, String first, String last) {
		super();
		this.title = title;
		this.first = first;
		this.last = last;
	}
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
