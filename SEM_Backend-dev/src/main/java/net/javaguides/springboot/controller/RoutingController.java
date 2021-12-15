package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RoutingController {
	
	@RequestMapping("/login")
	public String welcome()
	{
		return "Track_Progress";
	}

}
