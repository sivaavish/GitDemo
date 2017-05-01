package com.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWiringClass {
	
	@Autowired
	@Qualifier("details")
	private Details details;
	@Autowired
	@Qualifier("students")
	private Students students;

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}
	
	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		System.out.println("Students>>>");
		this.students = students;
	}

	public void show(){
		System.out.println(details.getMessage());
		System.out.println(students.getName());
		System.out.println(students.getDepartment());
		System.out.println(students.getMarks());
		System.out.println("AutoWiring Class");
		System.out.println("Second Branch");
		
	}

}
