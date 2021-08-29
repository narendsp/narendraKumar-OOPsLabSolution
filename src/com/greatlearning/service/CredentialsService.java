package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;


public class CredentialsService {

	public String generateEmailAddress( Employee emp ) {
		
		StringBuilder builder = new StringBuilder();
		builder
			.append( emp.getFirstName() )
			.append( emp.getLastName() )
			.append( "@" )
			.append( emp.getDepartment() )
			.append( ".abc.com" );
		
		return builder.toString();
	}
	

	public String generatePassword() {
	
		String allPossibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)";
		Random random = new Random();
		
		String password = "";
		
		
		for( int i = 0; i < 8; i++ ) {
			int idx = random.nextInt( allPossibleChars.length() );
			password = password + allPossibleChars.charAt( idx ); // "D" / "^"
		}
		
		return password;
	}
	
	
	public void showCredentials( Employee emp, String email, String password ) {
		System.out.println( "Dear " + emp.getFirstName() + ", here are your credentials..." );
		System.out.println( "Email : " + email );
		System.out.println( "Password : " + password );
	}
}
