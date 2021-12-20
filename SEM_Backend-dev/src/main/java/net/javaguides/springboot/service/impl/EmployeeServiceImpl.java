package net.javaguides.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;


	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	//build get employee by id REST API
	@Override
	//	http://localhost:8086/api/employees/4
	public Employee getEmployeeById(long id) {
		java.util.Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
			throw new ResourceNotFoundException("Employee","Id",id);
		}
	}
	//bulid update employee REST API
	//controller layer depends on service layer so first we will change service layer


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		//first we need to check whether employee with this id is existing in the database	
		Employee existingEmployee= employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee","Id",id));//lambda expression		

		//update the employee object which we get from the client

		//save existing employee to the database
		employeeRepository.save(existingEmployee);


		return existingEmployee;
	}


	@Override
	public Void deleteEmployee(long id) {
		// check whether the employee exist in a db or not
		employeeRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Employee","Id",id));
		employeeRepository.deleteById(id);
		return null;

	}
}
