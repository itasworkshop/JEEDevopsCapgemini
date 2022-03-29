package com.mysite.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Column(name="st_id")
	private @Id Integer id;
	private String sname;
	private Integer dept_id;
	private String subject;
	
	public Student() {}

	public Student(Integer id, String sname, Integer dept_id, String subject) {
		super();
		this.id = id;
		this.sname = sname;
		this.dept_id = dept_id;
		this.subject = subject;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", dept_id=" + dept_id + ", subject=" + subject + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept_id, id, sname, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dept_id, other.dept_id) && Objects.equals(id, other.id)
				&& Objects.equals(sname, other.sname) && Objects.equals(subject, other.subject);
	}
	
	

}
