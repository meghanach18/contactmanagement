package com.example.user.model;

public class Id {

	
	 public String name;
	    public String value;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "Id [name=" + name + ", value=" + value + "]";
		}
		public Id(String name, String value) {
			super();
			this.name = name;
			this.value = value;
		}
		public Id() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
