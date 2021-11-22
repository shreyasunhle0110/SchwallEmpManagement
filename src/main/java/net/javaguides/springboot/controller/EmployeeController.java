package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService  employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
//build create employee REST API.response entity represent the entire http status,we can control any options which goes into it
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
//bulid get all employee REST API
	@GetMapping
	public List<Employee> getAllEmployees() {
		return  employeeService.getAllEmployees();
		
	}
//build get employee by id REST API
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId) {
			return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
		
	}

//bulid update employee REST API
//controller layer depends on service layer so first we will change service layer
//http://localhost:8086/api/employees/1	
@PutMapping("{id}")
public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,@RequestBody Employee employee) {
//we have to store update employee REST API request body in  some object 
	return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id),HttpStatus.OK);
	
}
//build delete employee rest api
//http://localhost:8086/api/employees/1	
//controller layer is dependent on service layer after making changes in the service layer we can come to the controllerlayer
@DeleteMapping("{id}")
public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
	employeeService.deleteEmployee(id);
	return new ResponseEntity<String>("Employee deleted successfully",HttpStatus.OK);
}
	
}
