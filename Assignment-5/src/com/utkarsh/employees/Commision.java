package com.utkarsh.employees;

import java.util.Scanner;

public class Commision extends Emp {

	double grossSale;
	double commisionRate;
	Salaried s;
	Hourly h;
	
	
	
	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	} 
	
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Gross Sale :");
		grossSale = sc.nextDouble();
		
		System.out.println("Enter Commision Rate :");
		commisionRate = sc.nextInt();
	}
	
	@Override
	public String toString() {
		
		return "Name : "+ getFirstName() + " " + getLastName() + " \n Social Security Number"+ getSsn()+
				"Week Salary :"+ s.getWeeksal()+ "Hourly Wage :"+h.getHourlyWage() + "Hours Wroked : "+h.getHoursWorked()
				+" \n Gross Sale: "+grossSale+"Commision Rate : "+commisionRate;
	}

	@Override
	public void calculateSalary() {
		
		System.out.println(commisionRate*grossSale);
	}
	
}
