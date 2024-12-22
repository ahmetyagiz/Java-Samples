package com.ahmetyagiz.services;

import java.util.List;

import com.ahmetyagiz.dto.DtoStudent;
import com.ahmetyagiz.dto.DtoStudentIU;

public interface IStudentService {
	
	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudentById(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}