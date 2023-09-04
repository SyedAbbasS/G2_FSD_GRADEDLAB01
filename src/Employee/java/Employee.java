package Employee.java;

public class Employee {
	  private String firstName;
	    private String lastName;
	    private String email;
	    private String password;

	    // Parameterized constructor
	    public Employee(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    // Getter for email
	    public String getEmail() {
	        return email;
	    }

	    // Setter for email
	    public void setEmail(String email) {
	        this.email = email;
	    }

	    // Getter for password
	    public String getPassword() {
	        return password;
	    }

	    // Setter for password
	    public void setPassword(String password) {
	        this.password = password;
	    }

	    // Getter for first name
	    public String getFirstName() {
	        return firstName;
	    }

	public String getLastName() {
			return lastName;
		}

	@Override
	    public String toString() {
	        return "Employee{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", email='" + email + '\'' +
	                ", password='" + password + '\'' +
	                '}';
	    }

		
	}

