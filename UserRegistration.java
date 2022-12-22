package com.bl.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);

	// check the first name should be start with Capital latter
	public void checkFirst() {
		System.out.println("Enter First name Start with capital latter");
		String firstName = sc.nextLine();
		if (Pattern.matches("[A-Z]{1}[a-z]{2}", firstName)) {
			System.out.println("First Name is valid");
		} else {
			System.out.println("First Name is Not valid");
		}
	}

	// check the last name should be start with Capital latter
	public void checklastName() {
		System.out.println("Enter Last Name Start with capital latter");
		String LastName = sc.nextLine();
		if (Pattern.matches("[amod]{1,}[A-Z]{3}", LastName)) {
			System.out.println("Last Name is valid");
		} else {
			System.out.println("Last Name is not valid");
		}
	}

	// check given email are valid or not
	public void validEmail() {
		System.out.println("Enter a Email");
		String Email = sc.next();
		if (Pattern.matches("^[a-z]{3}[.]{1}[A-Za-z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.]{1}[a-z]*$*", Email)) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is not valid");
		}
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.checkFirst();
		userRegistration.checklastName();
		userRegistration.validEmail();
	}

}
