package com.Validation.example.dta;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserRequst {
	@NotNull(message="user name should not be null")
	private String name;
	@Email
	private String email;
	@Pattern(regexp="^\\d{10}$",message="invalid mobile number")
	private String mobail;
	private String gender;
	@Min(18)
	@Max(60)
	private int age;
	@NotBlank
	private String nationality;
	public UserRequst() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobail() {
		return mobail;
	}
	public void setMobail(String mobail) {
		this.mobail = mobail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public UserRequst(String name, String email, String mobail, String gender, int age, String nationality) {
		super();
		this.name = name;
		this.email = email;
		this.mobail = mobail;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "UserRequst [name=" + name + ", email=" + email + ", mobail=" + mobail + ", gender=" + gender + ", age="
				+ age + ", nationality=" + nationality + "]";
	}
}
