package com.example.user.model;

public class cooridinates {
	
	 public String latitude;
	    public String longitude;
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		@Override
		public String toString() {
			return "cooridinates [latitude=" + latitude + ", longitude=" + longitude + "]";
		}
		public cooridinates(String latitude, String longitude) {
			super();
			this.latitude = latitude;
			this.longitude = longitude;
		}
		public cooridinates() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
