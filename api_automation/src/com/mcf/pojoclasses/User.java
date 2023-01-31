package com.mcf.pojoclasses;

import java.util.List;

public class User {
	
	private String title;
	private String first_name;
	private String middle_name;
	private String last_name;
	
	private String email;
	private String phone;
	
	
	
	private String dob;
	private String account_number;
	private String sort_code;
	private String employment_sector;
	private String employment_position;
	private String association;
	private List<Addresses> addresses;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getSort_code() {
		return sort_code;
	}
	public void setSort_code(String sort_code) {
		this.sort_code = sort_code;
	}
	public String getEmployment_sector() {
		return employment_sector;
	}
	public void setEmployment_sector(String employment_sector) {
		this.employment_sector = employment_sector;
	}
	public String getEmployment_position() {
		return employment_position;
	}
	public void setEmployment_position(String employment_position) {
		this.employment_position = employment_position;
	}
	public String getAssociation() {
		return association;
	}
	public void setAssociation(String association) {
		this.association = association;
	}
	public List<Addresses> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Addresses> addresses) {
		this.addresses = addresses;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
