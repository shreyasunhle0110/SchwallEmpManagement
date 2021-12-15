package net.javaguides.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Entity   //jpa entity
@Table(name="CertificateUpload")
public class CertificateUpload {
	
	@Id  //denotes primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@generated value generation strategies for the values of primary keys
	private Long id;
}
