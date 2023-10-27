package com.example.duc.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lophoc")
public class Classes {
	@Id
	private String msLop;
	
	private String tenLop;
	
	private String giaovienCn;
	
	@OneToMany(mappedBy = "classes")
	private List<Student> lsStudent;

	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classes(String msLop, String tenLop, String giaovienCn) {
		super();
		this.msLop = msLop;
		this.tenLop = tenLop;
		this.giaovienCn = giaovienCn;
	}

	public String getMsLop() {
		return msLop;
	}

	public void setMsLop(String msLop) {
		this.msLop = msLop;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getGiaovienCn() {
		return giaovienCn;
	}

	public void setGiaovienCn(String giaovienCn) {
		this.giaovienCn = giaovienCn;
	}

	public List<Student> getLsStudent() {
		return lsStudent;
	}

	public void setLsStudent(List<Student> lsStudent) {
		this.lsStudent = lsStudent;
	}

	@Override
	public String toString() {
		return "Class [msLop=" + msLop + ", tenLop=" + tenLop + ", giaovienCn=" + giaovienCn + "]";
	}

}
