package com.ahmetyagiz.controller;

import java.util.List;

import com.ahmetyagiz.entities.Student;

public interface IStudentController {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer id);
	
	public void deleteStudentById(Integer id);
}