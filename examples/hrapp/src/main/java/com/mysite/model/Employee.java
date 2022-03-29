package com.mysite.model;


import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="EMPLOYEES")
public class Employee {
	
	private @Id Integer employee_id;
	private Integer salary, commission_pct, manager_id, department_id;
	private String first_name, last_name, email,job_id, phone_number;
	private Date hire_date;
	
	public Employee() {}
	
	public Employee(Integer employee_id, String job_id, Integer salary, Integer commission_pct, Integer manager_id,
			Integer department_id, String first_name, String last_name, String email, String phone_number,
			Date hire_date) {
		super();
		this.employee_id = employee_id;
		this.job_id = job_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.hire_date = hire_date;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getCommission_pct() {
		return commission_pct;
	}

	public void setCommission_pct(Integer commission_pct) {
		this.commission_pct = commission_pct;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", job_id=" + job_id + ", salary=" + salary
				+ ", commission_pct=" + commission_pct + ", manager_id=" + manager_id + ", department_id="
				+ department_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", phone_number=" + phone_number + ", hire_date=" + hire_date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(commission_pct, department_id, email, employee_id, first_name, hire_date, job_id, last_name,
				manager_id, phone_number, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(commission_pct, other.commission_pct)
				&& Objects.equals(department_id, other.department_id) && Objects.equals(email, other.email)
				&& Objects.equals(employee_id, other.employee_id) && Objects.equals(first_name, other.first_name)
				&& Objects.equals(hire_date, other.hire_date) && Objects.equals(job_id, other.job_id)
				&& Objects.equals(last_name, other.last_name) && Objects.equals(manager_id, other.manager_id)
				&& Objects.equals(phone_number, other.phone_number) && Objects.equals(salary, other.salary);
	}


}
