package com.learningSpring.myFirstWebApp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	private Long id ;
	private String name ;
	private String password;
	private String c_password;
	
	
	public Users() {
		
	}
	
	public Users(Long id, String name, String password, String c_password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.c_password = c_password;
	}
	
	public Users(Long id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	

	public Users(String name, String password, String c_password) {
		this.name = name;
		this.password = password;
		this.c_password = c_password;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getC_password() {
		return c_password;
	}

	public void setC_password(String c_password) {
		this.c_password = c_password;
	}

//	@Override
//	public String toString() {
//		return "Users [name=" + name + ", password=" + password + ", c_password=" + c_password + "]";
//	}
	
	
	
	
	
	
	
	
	
}
