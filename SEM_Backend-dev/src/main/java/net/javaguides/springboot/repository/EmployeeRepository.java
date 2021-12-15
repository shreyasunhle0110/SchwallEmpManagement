package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Employee;

//jpa repository class provides repository annotation
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
