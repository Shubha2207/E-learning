package com.example.contact.model;

import java.sql.Date;

public class Contact {
	
	private int contact_id;
	private int user_id;
	private String first_name;
	private String last_name;
	private Date dob;
//	private long photo;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Contact(int contact_id, int user_id, String first_name, String last_name, Date dob) {
	super();
	this.contact_id = contact_id;
	this.user_id = user_id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.dob = dob;
}




	public int getUser_id() {
		return user_id;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
}
