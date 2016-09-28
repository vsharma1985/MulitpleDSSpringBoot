package com.sample.domain.stu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = " student_tbl")
public class Student {

	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long student_id;
	  
	  @NotNull
	  private String name;

	  public Student(){
		  
	  }
	public long getStudent_id() {
		return student_id;
	}

	public String getName() {
		return name;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + name + "]";
	}
}
