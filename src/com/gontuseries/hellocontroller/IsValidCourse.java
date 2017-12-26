package com.gontuseries.hellocontroller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = CourseValidator.class)
@Target( ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidCourse {

	String listOfValidCourses();
	
	String message() default "Please provide valid course: "+
	"accepted course are: IT,CS,JAVA,MVC";
	
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{}; 
}
