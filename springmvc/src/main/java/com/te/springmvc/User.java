package com.te.springmvc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class User {
	@Id
	private String email;
	private String username;
	private String password;
	private String retype_password;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRetype_password() {
		return retype_password;
	}

	public void setRetype_password(String retype_password) {
		this.retype_password = retype_password;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", username=" + username + ", password=" + password + ", retype_password="
				+ retype_password + "]";
	}


	

}
