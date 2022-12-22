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

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.checkFirst();
	}

}
