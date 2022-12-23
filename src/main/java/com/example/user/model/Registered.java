package com.example.user.model;

import java.sql.Date;

public class Registered {
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
			return "Registered [date=" + date + ", age=" + age + "]";
		}
		public Registered(Date date, int age) {
			super();
			this.date = date;
			this.age = age;
		}
		public Registered() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
