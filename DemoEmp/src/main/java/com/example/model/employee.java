package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee 
{
	@Id
	private int eid;
	private String ename;
	private int salary;
	
	public employee() {
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeController [ename=" + ename + ", eid=" + eid + ", salary=" + salary + "]";
	}
}
