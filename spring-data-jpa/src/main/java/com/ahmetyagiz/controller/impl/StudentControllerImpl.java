package com.ahmetyagiz.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmetyagiz.controller.IStudentController;
import com.ahmetyagiz.entities.Student;
import com.ahmetyagiz.services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{

	@Autowired
	private IStudentService studentService;
	
	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		return studentService.saveStudent(student);
	}

	@GetMapping(path = "/list")
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentService.getAllStudents();
	}
}
