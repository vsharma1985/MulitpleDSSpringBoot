package com.sample.springBoot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class App 
{
		 
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
