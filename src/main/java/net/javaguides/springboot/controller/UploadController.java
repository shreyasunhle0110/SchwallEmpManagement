	package com.certificate.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.certificate.demo.service.UploadService;

@Controller
public class UploadController {
	
	
	
	@Autowired
	private UploadService service;
	
	@GetMapping("/uploadlink")
	public String upload()
	{
		return "upload";
	}
	
	@ResponseBody
	@PostMapping("/uploadImage")
	public String uploadImage(@RequestParam("imageFile") MultipartFile imageFile) throws Exception
	{

		return service.saveImage(imageFile);
		
		
		
	}
	
}
