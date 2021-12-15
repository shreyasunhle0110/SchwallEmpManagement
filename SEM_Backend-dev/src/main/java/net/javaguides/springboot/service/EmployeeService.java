package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
	//here return type is Employee
	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();
	
//return type is employee here
	Employee getEmployeeById(long id);

//return type of this method is Employee	
	Employee updateEmployee(Employee employee,long id);
	
//for delete operation
	Void deleteEmployee(long id);
	
}
