package com.utkarsh.employees;

import java.util.Scanner;

public class BaseplusComm extends Commision{
	private double basesal;
	Salaried s;
	Hourly h;
	Commision gross;
	Commision commission;

	public double getBasesal() {
		return basesal;
	}

	public void setBasesal(double basesal) {
		this.basesal = basesal;
	}  
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the Base Salary : ");
		basesal = sc.nextDouble();
		
	} 
	
	@Override
	public String toString() {
		
		return "Name : "+ getFirstName() + " " + getLastName() + " \n Social Security Number"+ getSsn()+
				"Week Salary :"+ s.getWeeksal()+ "Hourly Wage :"+h.getHourlyWage() + "Hours Wroked : "+h.getHoursWorked()
				+" \n Gross Sale: "+grossSale+"Commision Rate : "+commisionRate +"Base Salary : "+basesal ;
	}
	
	
	@Override
	public void calculateSalary() {
		
		System.out.println((commisionRate*grossSale)+basesal);
	}
	
}
