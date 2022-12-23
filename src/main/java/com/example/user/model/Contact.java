package com.example.user.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity 
@Table
public class Contact {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
	private int id;
   @Column
private String name;
   @Column 
   private Integer age;
//  @Column  
//   private Integer count;
@Column  
    private String address;
	@Column 
    private String gender;
	@Column 
    private String interestedinIT;
	@Column 
    private String coursesinterested;
	@Column 
    private long percentage;
 @Column 
    private String percentageinWords;
 @Column 
 private String ip;
 
 public  String Location;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getInterestedinIT() {
	return interestedinIT;
}

public void setInterestedinIT(String interestedinIT) {
	this.interestedinIT = interestedinIT;
}

public String getCoursesinterested() {
	return coursesinterested;
}

public void setCoursesinterested(String coursesinterested) {
	this.coursesinterested = coursesinterested;
}

public long getPercentage() {
	return percentage;
}

public void setPercentage(long percentage) {
	this.percentage = percentage;
}

public String getPercentageinWords() {
	return percentageinWords;
}

public void setPercentageinWords(String percentageinWords) {
	this.percentageinWords = percentageinWords;
}

public String getIp() {
	return ip;
}

public void setIp(String ip) {
	this.ip = ip;
}

public String getLocation() {
	return Location;
}

public void setLocation(String location) {
	Location = location;
}

@Override
public String toString() {
	return "Contact [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender
			+ ", interestedinIT=" + interestedinIT + ", coursesinterested=" + coursesinterested + ", percentage="
			+ percentage + ", percentageinWords=" + percentageinWords + ", ip=" + ip + ", Location=" + Location + "]";
}

public Contact(int id, String name, Integer age, String address, String gender, String interestedinIT,
		String coursesinterested, Long percentage, String percentageinWords, String ip, String location) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.address = address;
	this.gender = gender;
	this.interestedinIT = interestedinIT;
	this.coursesinterested = coursesinterested;
	this.percentage = percentage;
	this.percentageinWords = percentageinWords;
	this.ip = ip;
	Location = location;
}

public Contact() {
	super();
	// TODO Auto-generated constructor stub
} 
 
 


 


 
 
 
 
}
