package com.Tester;
import Exception.*;
import com.utkarsh.string.*;

public class TestProgram {

	public static void main(String[] args) {
		
		String1 s = new String1();
		
		try {
			s.accept();
		} 
		catch(ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		
		
		

	}

}
