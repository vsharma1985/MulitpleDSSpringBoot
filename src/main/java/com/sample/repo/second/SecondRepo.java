package com.sample.repo.second;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sample.domain.stu.Student;

@Transactional 
@Repository
public interface SecondRepo  extends CrudRepository<Student, Integer>{

}
