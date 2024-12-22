package com.ahmetyagiz.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	//SET
	
	private String firstName;
	
	private String lastName;
	
	private Date birthOfDate;
}