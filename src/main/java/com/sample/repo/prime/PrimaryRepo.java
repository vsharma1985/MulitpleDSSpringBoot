package com.sample.repo.prime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sample.domain.emp.Employee;


@Transactional 
@Repository
public interface PrimaryRepo extends JpaRepository<Employee, Integer>{
	


}
