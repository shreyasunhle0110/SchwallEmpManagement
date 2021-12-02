package com.certificate.demo.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certificate.demo.model.Employee;
import com.certificate.demo.repo.EmployeeRepo;




@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public String forservice(String email)
	{
		
		System.out.println(email);
		Optional<Employee> opt=Optional.ofNullable(repo.findByEmail(email));
		System.out.println(opt);
		if(!opt.isPresent())
		{
			return "Invaild Mail Id";
		}
		
		Employee ser=opt.get();
		ser.setToken(getToken());
	   
		repo.save(ser);
		return ser.getToken();
	}

	private String getToken() {
		StringBuffer token=new StringBuffer();
		System.out.println(token);
		return token.append(UUID.randomUUID().toString())
				.append(UUID.randomUUID().toString()).toString();
	}
	
	public String resetPassword(String token,String password)
	{
		Optional<Employee> optt=Optional.ofNullable(repo.findByToken(token));
		
		if(!optt.isPresent())
		{
			return "Invalid Token";
		}
		
		System.out.println("Password>>"+password);
		System.out.println("token>>"+token);
		
		Employee user=optt.get();
		
		System.out.println("user>>"+user);
		user.setPassword(password);
		user.setToken(token);
        repo.save(user);
           
           
		return "Your Password Successfully Updated";
	}
	
	

}
