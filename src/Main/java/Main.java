package Main.java;

import java.util.Scanner;

import CredentialService.java.CredentialService;
import Department.java.Department;
import Employee.java.Employee;

public class Main {

	public static void main(String[] args) {
		String company = "GL instituitions";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the department from the following:");
        System.out.println("1. Technical\n2. Admin\n3. HR\n4. Legal");
        int departmentChoice = scanner.nextInt();
        Department department;
        if (departmentChoice >= 1 && departmentChoice <= 4) {
            department = Department.values()[departmentChoice - 1];
        } else {
            System.out.println("Invalid department choice.");
            return; 
        }
        System.out.println("Enter the first name:");
        String firstName = scanner.next();
        System.out.println("Enter the last name:");
        String lastName = scanner.next();

        Employee newEmployee = new Employee(firstName, lastName);

        String email = CredentialService.generateEmailAddress(newEmployee.getFirstName(), newEmployee.getLastName(), department, company);
        String password = CredentialService.generatePassword();

        newEmployee.setEmail(email);
        newEmployee.setPassword(password);

        CredentialService.showCredentials(newEmployee);

	}

}
