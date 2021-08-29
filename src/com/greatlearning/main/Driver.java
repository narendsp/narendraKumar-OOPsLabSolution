package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class Driver {

	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );

		System.out.println( "First name : " );
		String firstName = sc.next();
		
		System.out.println( "Last name : " );
		String lastName = sc.next();
		
		System.out.println( "Choose your department (1 - 4)" );
		System.out.println( "1. Technical" );
		System.out.println( "2. Admin" );
		System.out.println( "3. Human Resources" );
		System.out.println( "4. Legal" );
		
		int choice = sc.nextInt();

		String dept;
		
		switch( choice ) {
			case 1:
				dept = "tech";
				break;
			case 2:
				dept = "adm";
				break;
			case 3:
				dept = "hr";
				break;
			case 4:
				dept = "lg";
				break;
			default:
				System.out.println( "Incorrect choice" );
				return;
		}
		
		Employee emp = new Employee( firstName, lastName, dept );
		

		CredentialsService cs = new CredentialsService(); 
		

		String email = cs.generateEmailAddress( emp );

		String password = cs.generatePassword();

		cs.showCredentials( emp, email, password );
		
		// sc.close();
	}
}
