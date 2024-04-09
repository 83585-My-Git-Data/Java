package com.emp.main;

import java.util.Scanner;

import com.utkarsh.employees.*;

public class MainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Emp e1;
//		e1.acceptData(sc); 
//		e1.calculateSalary();
		int choice;
		
		do {
			System.out.println("PRESS 0 : EXIT");
			System.out.println("PRESS 1 : SALARIED EMPLOYEE");
			System.out.println("PRESS 2 : HOURLY EMPLOYEE");
			System.out.println("PRESS 3 : COMMISSION EMPLOYEE");
			System.out.println("PRESS 4 : BASE SALARY AND COMMISSION EMPLOYEE");
//			int choice;
			choice = sc.nextInt();
			
			switch (choice) {
			case 0 :
				System.out.println("EXITING....!");
				break;
				
			case 1:
				e1 = new Salaried();
				e1.acceptData(sc);
				e1.calculateSalary();
				
				break;
				
			case 2: 
				 e1 = new Hourly();
				e1.acceptData(sc); 
				e1.calculateSalary();
				break;
				
			case 3:
				
				 e1 = new Commision();
				e1.acceptData(sc); 
				e1.calculateSalary();
				break;
				
			case 4:
				 e1 = new BaseplusComm();
				e1.acceptData(sc); 
				e1.calculateSalary();
				break;


			default:
				break;
			}
			
			
		} while (choice != 0);
		
		

	}

}
