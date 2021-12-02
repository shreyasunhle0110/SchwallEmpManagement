package com.certificate.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.certificate.demo.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee,Long>{
	
	Employee findByEmail(String email);
	
	Employee findByToken(String token);

}
