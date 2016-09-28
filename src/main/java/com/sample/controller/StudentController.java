package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.domain.stu.Student;
import com.sample.repo.second.SecondRepo;



@Controller

@EnableAutoConfiguration
public class StudentController {

	/*@Autowired
	SecondRepo studentRepo;
	
	 @RequestMapping(value = "/getStudents", method = RequestMethod.GET)
	  public String getStudents() {
		  List<Student> empList = null;
		 String userId = "";	
		    try {
		      
		      empList= (List<Student>) studentRepo.findAll();
		      for (Student emp:empList)
		      System.out.println("Emp ID :"+emp.getStudent_id()+ " Employee Name :"+emp.getName()  );
		    }
		    catch (Exception ex) {
		      return "Error creating the user: " + ex.toString();
		    }
		    return empList.toString();
		  
	}*/
}
