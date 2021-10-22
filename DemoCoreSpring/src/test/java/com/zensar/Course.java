package com.zensar;

public class Course 
{

	private int cid;
	String coursename;
	int fees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Course Default constructor!!");
	}
	public Course(int cid, String coursename, int fees) {
		super();
		this.cid = cid;
		this.coursename = coursename;
		this.fees = fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", coursename=" + coursename + ", fees=" + fees + "]";
	}
	 
	
}
