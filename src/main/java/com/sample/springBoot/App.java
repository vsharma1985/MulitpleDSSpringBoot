package com.sample.springBoot;

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
