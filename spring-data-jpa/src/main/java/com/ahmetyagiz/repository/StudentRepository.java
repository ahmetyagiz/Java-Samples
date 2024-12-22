package com.ahmetyagiz.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ahmetyagiz.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	// HQL : Sınıfın ismi ve değiken isimleri kullanılarak sorgular yazılır
	@Query(value = "Select * from student.student", nativeQuery = true)
	List<Student> findAllStudents();
	
	// SQL : Tablo ismi ve tablo içerisindeki kolon isimleri ile sorgular yazılır
//	@Query(value = "from Student", nativeQuery = false)
//	List<Student> findAllStudents();
	
	@Query(value = "from Student s WHERE s.id = :studentId", nativeQuery = false)
	Optional<Student> findStudentById(Integer studentId);
}
