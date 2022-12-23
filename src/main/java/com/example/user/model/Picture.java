package com.example.user.model;

public class Picture {

	public String large;
    public String medium;
    public String thumbnail;
	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	@Override
	public String toString() {
		return "Picture [large=" + large + ", medium=" + medium + ", thumbnail=" + thumbnail + "]";
	}
	public Picture(String large, String medium, String thumbnail) {
		super();
		this.large = large;
		this.medium = medium;
		this.thumbnail = thumbnail;
	}
	public Picture() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
