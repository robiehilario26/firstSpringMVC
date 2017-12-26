package com.gontuseries.hellocontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseValidator implements ConstraintValidator<IsValidCourse, String>{

	private String listOfValidCourses;
	
	@Override
	public void initialize(IsValidCourse IsValidCourse) {
		this.listOfValidCourses = IsValidCourse.listOfValidCourses();
		
	}

	@Override
	public boolean isValid(String sCourse, ConstraintValidatorContext ctx) {
		if(sCourse == null){
			return false;
		}
		if(sCourse.matches(listOfValidCourses)){
			return true;
		}
		else
		{
			return false;
		}
		
	}

	
}
