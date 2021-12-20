package net.javaguides.springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//lombok used to reduce getters and setters,constructors
import lombok.Data;

@Data
@Entity
@Table(name="employeeMaster")
public class Employee {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "empName")
	private String empName;

	@Column(name="DateOfJoining")
	private String doj;

	@Column(name="DateofBirth")
	private String dob;

	@Column(name="BloodGroup")
	private String bloodGroup;

	@Column(name= "MaritialStatus")
	private Boolean martialStatus;

	@Column(name="SpouceName")
	private String spouceName;

	@Column(name = "empNumber")
	private Long contactNumber;

	@Column(name = "empEmail")
	private String empEmail;

	@Column(name = "empPermanentAddress")
	private String empPermanentAddress;

	@Column(name = "empCommunicationAddress")
	private String empCommunicationAddress;

	@Column(name="RoleID")
	private Long roleID;

	@Column(name="CreatedOn")
	private String createdOn;

	@Column(name = "CreatedBy")
	private Long createdBy;

	@Column(name = "DateModified")
	private String dateModified;

	@Column(name = "ModifiedBy")
	private Long modifiedBy;

	@Column(name="password")
	private String password;



	public Employee(Long id, String empName, String doj, String dob, String bloodGroup, Boolean martialStatus,
			String spouceName, Long contactNumber, String empEmail, String empPermanentAddress,
			String empCommunicationAddress, Long roleID, String createdOn, Long createdBy, String dateModified,
			Long modifiedBy, String password) {
		super();
		this.id = id;
		this.empName = empName;
		this.doj = doj;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.martialStatus = martialStatus;
		this.spouceName = spouceName;
		this.contactNumber = contactNumber;
		this.empEmail = empEmail;
		this.empPermanentAddress = empPermanentAddress;
		this.empCommunicationAddress = empCommunicationAddress;
		this.roleID = roleID;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.dateModified = dateModified;
		this.modifiedBy = modifiedBy;
		this.password = password;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getDoj() {
		return doj;
	}



	public void setDoj(String doj) {
		this.doj = doj;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getBloodGroup() {
		return bloodGroup;
	}



	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}



	public Boolean getMartialStatus() {
		return martialStatus;
	}



	public void setMartialStatus(Boolean martialStatus) {
		this.martialStatus = martialStatus;
	}



	public String getSpouceName() {
		return spouceName;
	}



	public void setSpouceName(String spouceName) {
		this.spouceName = spouceName;
	}



	public Long getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getEmpEmail() {
		return empEmail;
	}



	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}



	public String getEmpPermanentAddress() {
		return empPermanentAddress;
	}



	public void setEmpPermanentAddress(String empPermanentAddress) {
		this.empPermanentAddress = empPermanentAddress;
	}



	public String getEmpCommunicationAddress() {
		return empCommunicationAddress;
	}



	public void setEmpCommunicationAddress(String empCommunicationAddress) {
		this.empCommunicationAddress = empCommunicationAddress;
	}



	public Long getRoleID() {
		return roleID;
	}



	public void setRoleID(Long roleID) {
		this.roleID = roleID;
	}



	public String getCreatedOn() {
		return createdOn;
	}



	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}



	public Long getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}



	public String getDateModified() {
		return dateModified;
	}



	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}



	public Long getModifiedBy() {
		return modifiedBy;
	}



	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Employee() {
		super();
	}




}
