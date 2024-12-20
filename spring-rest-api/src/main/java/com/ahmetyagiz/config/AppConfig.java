package com.ahmetyagiz.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ahmetyagiz.model.Employee;

@Configuration
public class AppConfig {
	@Bean
	public List<Employee> employeeList() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1", "Ahmet", "Yagiz"));
		employeeList.add(new Employee("2", "Yakup", "Reçber"));
		employeeList.add(new Employee("3", "Bilal", "Çamur"));
		employeeList.add(new Employee("4", "Harun", "Kaymazalp"));
		employeeList.add(new Employee("5", "Yasin", "Yazıcı"));
		
		return employeeList;
	}
}
