package com.utkarsh.employees;

import java.util.Scanner;

public class Hourly extends Emp{
	double hourlyWage;
	int hoursWorked;
	int hourlySalary;
	Salaried s ;
	
	
	
	public double getHourlyWage() {
		return hourlyWage;
	}


	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Hourly Wages :");
		hourlyWage = sc.nextDouble();
		
		System.out.println("Enter Hours Worked :");
		hoursWorked = sc.nextInt();
	}

	@Override
	public String toString() {
		
		return "Name : "+ getFirstName() + " " + getLastName() + " \n Social Security Number"+ getSsn()+
				"Week Salary :"+ s.getWeeksal()+ "Hourly Wage :"+hourlyWage + "Hours Wroked : "+hoursWorked;
	}


	@Override
	public void calculateSalary() {
		if(hoursWorked <=40 ) {
		System.out.println(hoursWorked*hourlyWage);
		}
		else {
			System.out.println(40*hourlyWage+(hoursWorked - 40)*hourlyWage*1.5);
		}
	}
}
