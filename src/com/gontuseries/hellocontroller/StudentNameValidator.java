package com.gontuseries.hellocontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StudentNameValidator implements
		ConstraintValidator<IsValidStudentName, String> {

	private String listOfStudents;

	@Override
	public void initialize(IsValidStudentName isValidStudentName) {
		this.listOfStudents = isValidStudentName.listOfStudents();
	}

	@Override
	public boolean isValid(String sName, ConstraintValidatorContext ctx) {
		System.out.println("listOfStudents " + listOfStudents);
		System.out.println("sName " + sName);


		if (sName == null) {
			return false;
		}

		if (sName.matches(listOfStudents)) {
			System.out.println("true " + sName);
			return true;

		} else {
			System.out.println("false " + sName);
			return false;

		}

	}

}
