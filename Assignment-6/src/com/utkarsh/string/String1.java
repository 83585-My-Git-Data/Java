package com.utkarsh.string;
import Exception.*;
import java.util.Scanner;

public class String1 {
	
	String s;

	public void accept() throws ExceptionLineTooLong {
		
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();		    
		 
		if(s.length() < 80) {
			System.out.println(s.length());
		} 
		
		else {
			throw new ExceptionLineTooLong("Length is too long");
		}
	} 
	
	
	
	
	
	
}