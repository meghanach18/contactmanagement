package com.example.user.model;

import java.sql.Date;

public class Dob {
	  public Date date;
	    public int age;
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Dob [date=" + date + ", age=" + age + "]";
		}
		public Dob(Date date, int age) {
			super();
			this.date = date;
			this.age = age;
		}
		public Dob() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	    
}
