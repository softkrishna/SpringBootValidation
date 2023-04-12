package com.Validation.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_DTL")

public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String name;
	private String email;
	private String mobail;
	private String gender;
	public User() {
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	private int age;
	private String nationality;
	public User(int userId, String name, String email, String mobail, String gender, int age, String nationality) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.mobail = mobail;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", mobail=" + mobail + ", gender="
				+ gender + ", age=" + age + ", nationality=" + nationality + "]";
	}
	
}
