package com.ahmetyagiz.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmetyagiz.controller.IStudentController;
import com.ahmetyagiz.dto.DtoStudent;
import com.ahmetyagiz.dto.DtoStudentIU;
import com.ahmetyagiz.entities.Student;
import com.ahmetyagiz.services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{

	@Autowired
	private IStudentService studentService;
	
	@PostMapping(path = "/save")
	@Override
	public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
		return studentService.saveStudent(dtoStudentIU);
	}

	@GetMapping(path = "/list")
	@Override
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping(path = "/list/{id}")
	@Override
	public Student getStudentById(@PathVariable(name = "id") Integer id) {
	    return studentService.getStudentById(id);
	}

	@DeleteMapping(path = "/list/{id}")
	@Override
	public void deleteStudentById(@PathVariable(name = "id") Integer id) {
		studentService.deleteStudentById(id);
	}

	@PutMapping(path = "/update/{id}")
	@Override
	public Student updateStudent(@PathVariable(name = "id") Integer id, @RequestBody Student updateStudent) {
		// TODO Auto-generated method stub
		return studentService.updateStudent(id, updateStudent);
	}
}

