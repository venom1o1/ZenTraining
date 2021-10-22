package com.dao;

public interface Studentdao {
	Student getStudent(int id);
	List<Student > getAllStudents();
	boolean insertStudent(Student student);
	boolean updateStudent(Student s);
	boolean delteStudent(int id);

}
