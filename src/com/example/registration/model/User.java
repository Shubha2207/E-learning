package com.example.registration.model;

public class User {
	
	private int user_id;
	private String user_name;
	private int phone_no;
	private String address;
//	private long photo;
	private String email;
	private String password;
	
	public User() {
		
	}
	
	public User(int user_id, String user_name, int phone_no, String address, long photo, String email,
			String password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.phone_no = phone_no;
		this.address = address;
//		this.photo = photo;
		this.email = email;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public long getPhoto() {
//		return photo;
//	}
//	public void setPhoto(long photo) {
//		this.photo = photo;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
