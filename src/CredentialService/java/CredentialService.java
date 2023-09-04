package CredentialService.java;

import java.util.Random;

import Department.java.Department;
import Employee.java.Employee;

public class CredentialService {
	 public static String generatePassword() {
	        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	        String numbers = "0123456789";
	        String specialCharacters = "!@#$%^&*()_+";

	        String allCharacters = capitalLetters + smallLetters + numbers + specialCharacters;

	        Random random = new Random();
	        StringBuilder password = new StringBuilder();

	        password.append(numbers.charAt(random.nextInt(numbers.length())));
	        password.append(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
	        password.append(smallLetters.charAt(random.nextInt(smallLetters.length())));
	        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

	        for (int i = 4; i < 12; i++) {
	            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
	        }

	        return password.toString();
	    }

	    public static String generateEmailAddress(String firstName, String lastName, Department department, String company) {
	        return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toString().toLowerCase() + "." + company.toLowerCase() + ".com";
	    }

	    public static void showCredentials(Employee employee) {
	        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
	        System.out.println("Email ---> " + employee.getEmail());
	        System.out.println("Password ---> " + employee.getPassword());
	    }
	}

