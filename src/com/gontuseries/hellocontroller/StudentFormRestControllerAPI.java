package com.gontuseries.hellocontroller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentFormRestControllerAPI {
	
	@RequestMapping(value="/rest", method = RequestMethod.GET)
	public ArrayList<StudentForm> getListStudents (){
		StudentForm s1 = new StudentForm();
		s1.setsName("rabbb1");
		s1.setsCourse("IT1");
		s1.setsNum(111);
		
		StudentForm s2 = new StudentForm();
		s2.setsName("rabbb2");
		s2.setsCourse("IT2");
		s2.setsNum(222);
		
		StudentForm s3 = new StudentForm();
		s3.setsName("rabbb3");
		s3.setsCourse("IT3");
		s3.setsNum(333);
		
		ArrayList<StudentForm> studentList = new ArrayList<StudentForm>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		return studentList;
		
	}

	@RequestMapping(value="/rest/{name}", method = RequestMethod.GET)
	public StudentForm restGetStudent(@PathVariable("name") String sName){
	
		StudentForm sf = new StudentForm();
		sf.setsName(sName);
		sf.setsCourse("IT test");
		return sf;
	}
}
