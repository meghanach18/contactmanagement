package com.example.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;



@Entity 
@Table
public class Rest {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column
   @NotEmpty
   @javax.validation.constraints.Size(message= "type should be mandataory" )
private String type;
   @Column 
   @NotEmpty
   @javax.validation.constraints.Size(message= "action should be mandataory" )
   private String  action;
   
   @Column 
   @NotEmpty
   @javax.validation.constraints.Size(message= "path should be mandataory" )
   private String  path;
   
   @Column 
   @NotEmpty
   @javax.validation.constraints.Size(message= " date should be mandataory" )
   private String  save_date;
   
   @Column 
   @NotEmpty
   @javax.validation.constraints.Size(message= "user should be mandataory" )
   private String  save_user;

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getAction() {
	return action;
}

public void setAction(String action) {
	this.action = action;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

public String getSave_date() {
	return save_date;
}

public void setSave_date(String save_date) {
	this.save_date = save_date;
}

public String getSave_user() {
	return save_user;
}

public void setSave_user(String save_user) {
	this.save_user = save_user;
}

@Override
public String toString() {
	return "Rest [type=" + type + ", action=" + action + ", path=" + path + ", save_date=" + save_date + ", save_user="
			+ save_user + "]";
}

public Rest(String type, String action, String path, String save_date, String save_user) {
	super();
	this.type = type;
	this.action = action;
	this.path = path;
	this.save_date = save_date;
	this.save_user = save_user;
}

public Rest() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
   
   

	
}
