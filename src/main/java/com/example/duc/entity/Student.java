package com.example.duc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class Student {
	@Id
	private String mssv;
	
	private String hoTen;
	
	private String email;
	
	private String diaChi;
	
	private String msLop;
	
	@ManyToOne
	@JoinColumn(name="classId")
	private Classes classes;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String mssv, String hoTen, String email, String diaChi, String msLop, Classes classes) {
		super();
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.email = email;
		this.diaChi = diaChi;
		this.msLop = msLop;
		this.classes = classes;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMsLop() {
		return msLop;
	}

	public void setMsLop(String msLop) {
		this.msLop = msLop;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", hoTen=" + hoTen + ", email=" + email + ", diaChi=" + diaChi + ", msLop="
				+ msLop + ", classes=" + classes + "]";
	}
	
}
