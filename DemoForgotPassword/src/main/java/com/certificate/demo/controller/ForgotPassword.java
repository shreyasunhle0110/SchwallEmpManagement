package com.certificate.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.certificate.demo.service.EmployeeService;

@Controller
public class ForgotPassword {

	@Autowired
	private EmployeeService service;

	@GetMapping("/Login")
	public String login() {
		return "Login";
	}

	@GetMapping("/forgot")
	public String forgotlink() {
		return "forgot";
	}

	@PostMapping("/processdata")
	public String processdata(@RequestParam("email") String email, Model model) {
		String pageName = "";
		String response = service.forservice(email);
		System.out.println(email);

		System.out.println("Invaild:>>" + response);

		if (!response.equals("Invaild Mail Id")) {
			// response = response;
			model.addAttribute("response", response);

			pageName = "processData";

		} else {
			pageName = "redirect:/forgot";
		}
		System.out.println("Page Name:>>" + pageName);

		return pageName;

	}

	@GetMapping("/processData")
	public String procesData() {
		return "processData";
	}

	@ResponseBody
	@PostMapping("/updatedata")
	public String updatedata(@RequestParam("token") String token, @RequestParam("password") String password) {
		
		return service.resetPassword(token, password);
	
	 
	}

}
