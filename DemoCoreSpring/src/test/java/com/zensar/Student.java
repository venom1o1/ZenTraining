package com.zensar;

public class Student 
{
 
		private int sid;
		private String sname;
		private int per;
		private Course course ;
		public Student(int sid, String sname, int per) {
			super();
			System.out.println("para constructor of student");
			this.sid = sid;
			this.sname = sname;
			this.per = per;
		}
		public Student() {
			System.out.println("Default constructor of student");
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public int getPer() {
			return per;
		}
		public void setPer(int per) {
			this.per = per;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", per=" + per + "]";
		}
		
}
