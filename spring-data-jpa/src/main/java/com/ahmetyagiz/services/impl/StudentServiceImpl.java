package com.ahmetyagiz.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmetyagiz.entities.Student;
import com.ahmetyagiz.repository.StudentRepository;
import com.ahmetyagiz.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
	    //return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
	}

}