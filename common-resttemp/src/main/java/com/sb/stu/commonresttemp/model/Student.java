package com.sb.stu.commonresttemp.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Student {

	private String sno;
	
	private String sname;
	
	private int sex;
	
	@JSONField(format = "yyyyMMdd")
	private Date birthDay;
	
	private Class sClass;
	
	public Student(){
		
	}
	
	public Student(String sno, String sname, int sex, Date birthDay) {
		this.sno = sno;
		this.sname = sname;
		this.sex = sex;
		this.birthDay = birthDay;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Class getsClass() {
		return sClass;
	}

	public void setsClass(Class sClass) {
		this.sClass = sClass;
	}
	
}
