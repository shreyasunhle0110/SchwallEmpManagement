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
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "number")
	private Long number;
	    
     @Column(name = "address")
	 private String address;
	    
	 @Column(name="role")
	 private String role;
	    
	 @Column(name="doj")
	 private String doj;
	    
	 @Column(name="dob")
	 private String dob;
	 
	 @Column(name="password")
	 private String password;
	 
	 
	 
	    
	//getters and setters for password
	 public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		//getters and setters for dob
	    public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		//generate getters and setters for doj
		public String getDoj() {
			return doj;
		}

		public void setDoj(String doj) {
			this.doj = doj;
		}

		//getters and setters for role
	    public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

	//getters and setters for address
	public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		//getters and setters for number
		public Long getNumber() {
			return number;
		}

		public void setNumber(Long number) {
			this.number = number;
		}
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee() {
		super();
	}

	public Employee(Long id, String firstName, String lastName, String email, Long number, String address, String role, String doj, String dob, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.number=number;
		this.address=address;
		this.role= role;
		this.doj=doj;
		this.dob=dob;
		this.password=password;
	}

}
