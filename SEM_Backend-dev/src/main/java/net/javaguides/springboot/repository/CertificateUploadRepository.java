package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot.model.CertificateUpload;


public interface CertificateUploadRepository extends JpaRepository<CertificateUpload, Long>{
	
}
