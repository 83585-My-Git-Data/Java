package com.utkarsh.employees;

import java.util.Scanner;

public class Salaried extends Emp{
	double weeksal;
	
	
	public Salaried() {
		
	}
	public double getWeeksal() {
		return weeksal;
	} 
	
	public void setWeeksal(double weeksal) {
		this.weeksal = weeksal;
	}
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter your Week Salary :");
		weeksal = sc.nextInt();	}
	
	@Override
	public String toString() {
		
		return "Name : "+ getFirstName() + " " + getLastName() + " \n Social Security Number"+ getSsn()+"\n weeksal: "+weeksal;
	}
	
	
	
	
	@Override
	public void calculateSalary() {
		System.out.println(weeksal);
		
	}
}
