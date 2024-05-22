package com.Maheshwar.SecureApp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyUser {
   private String firstname;
   private String lastname;
   @Id
   private String email;
   private String password;
   private String role="USER";
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
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
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password=" + password
			+ ", role=" + role + "]";
}
   
}
