package com.douzone.hellospring.vo;

public class UserVo {
	private Long no;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String joinDate;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate() {
		return joinDate;
	}
	public void setDate(String date) {
		this.joinDate = date;
	}
	@Override
	public String toString() {
		return "UserVo [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password + ", gerder="
				+ gender + ", joindate=" + joinDate + "]";
	}
}