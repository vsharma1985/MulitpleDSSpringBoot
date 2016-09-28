package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.domain.emp.Employee;
import com.sample.repo.prime.PrimaryRepo;





@Controller
@RequestMapping(value="/")
@EnableAutoConfiguration
public class EmployeeController {

	@Autowired
	private PrimaryRepo primaryRepo;
	
	
	/* @RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	  public String getEmployees() {
		  List<Employee> empList = null;
		 String userId = "";	
		    try {
		      
		      empList= (List<Employee>) primaryRepo.findAll();
		      for (Employee emp:empList)
		      System.out.println("Emp ID :"+emp.getEmp_id()+ " Employee Name :"+emp.getEmp_name()  );
		    }
		    catch (Exception ex) {
		      return "Error creating the user: " + ex.toString();
		    }
		    return empList.toString();
		  
	}*/
}
