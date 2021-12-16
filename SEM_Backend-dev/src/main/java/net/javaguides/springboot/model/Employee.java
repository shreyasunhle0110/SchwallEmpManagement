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
@Entity   //jpa entity
@Table(name="employees")
public class Employee {

	@Id  //denotes primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@generated value generation strategies for the values of primary keys
	private Long id;

	@Column(name = "empName", nullable = false)
	private String empName;


	@Column(name = "empEmail")
	private String email;

	@Column(name = "empNumber")
	private Long number;

	@Column(name = "empAddress")
	private String address;

	@Column(name="roleID")
	private Long roleID;
	
	

	@Column(name="doj")
	private String doj;

	@Column(name="dob")
	private String dob;

	@Column(name="password")
	private String password;



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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getRoleID() {
		return roleID;
	}

	public void setRoleID(Long roleID) {
		this.roleID = roleID;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Employee(Long id, String empName, String email, Long number, String address, Long roleID, String doj,
			String dob, String password) {
		super();
		this.id = id;
		this.empName = empName;
		this.email = email;
		this.number = number;
		this.address = address;
		this.roleID = roleID;
		this.doj = doj;
		this.dob = dob;
		this.password = password;
	}

	public Employee() {
		super();
	}
	



}
