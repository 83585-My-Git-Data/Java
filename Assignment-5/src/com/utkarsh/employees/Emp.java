package com.utkarsh.employees;

import java.util.Scanner;

public abstract class Emp {
	private String firstName;
	private String lastName;
	private int ssn; 
	
	public Emp() {
		
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

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	} 
	
	public void acceptData(Scanner sc) {
	System.out.println("Enter Your First Name :");
	firstName = sc.next();
	
	System.out.println("Enter Your Last Name :");
	lastName = sc.next();
	
	System.out.println("Enter Your Social Security Number:");
	ssn = sc.nextInt();
	
	} 
	
	@Override
	public String toString() {
		
		return "Name : "+ firstName + " " + lastName + " \n Social Security Number"+ ssn;
	}
	
	

	
	public abstract void calculateSalary();
	
}
