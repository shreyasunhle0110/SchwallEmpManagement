package com.certificate.demo.model;

import org.springframework.web.multipart.MultipartFile;


public class UploadModel {
	
	
	
	private String imageFile;
	
	
	
	public UploadModel()
	{
		
	}
	
	public UploadModel(String imageFile) {
		super();
		this.imageFile = imageFile;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	@Override
	public String toString() {
		return "UploadModel [imageFile=" + imageFile + "]";
	}

	
	
	

}
