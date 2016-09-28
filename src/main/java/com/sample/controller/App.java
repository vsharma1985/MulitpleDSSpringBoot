package com.sample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.domain.emp.Employee;
import com.sample.domain.stu.Student;
import com.sample.repo.prime.PrimaryRepo;
import com.sample.repo.second.SecondRepo;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="com.sample")
@RestController
public class App 
{
	@Autowired
	private PrimaryRepo primaryRepo;
	@Autowired
	private SecondRepo studentRepo;
	
	 @RequestMapping("/")
	    String home() {
	        return "Hello World!";
	    }

	 @RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
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
		  
	}
	 
	 	
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
			  
		}
	
	 
	 public static void main(String[] args) throws Exception {
	    	SpringApplication springApplication = new SpringApplication();
	    	 ApplicationContext ctx = springApplication.run(App.class, args);
	    	 System.out.println("dddddddddddd");
	    	 String[] beanNames = ctx.getBeanDefinitionNames();
	    	    Arrays.sort(beanNames);
	    	    for (String beanName : beanNames) {
	    	        System.out.print(beanName);
	    	        System.out.print(" ");
	    	    }

	    	    System.out.println("");
	    	}
	    
	 
	
}
