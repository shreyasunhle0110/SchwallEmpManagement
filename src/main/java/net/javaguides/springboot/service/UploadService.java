package com.certificate.demo.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadService {


	public String saveImage(MultipartFile imageFile) throws IOException {
		   String folder="D://photos/";
		   byte[] bytes=imageFile.getBytes();
		   Path path=Paths.get(folder + imageFile.getOriginalFilename());
		   Files.write(path, bytes);
	        return "Upload Successfully";
	 		
		}

}
