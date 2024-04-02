//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

public class CheckType {

	public static void main(String[] args) {
		
		double val1;
		double val2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your numbers to check : ");
		
		if(sc.hasNextDouble()){
			val1 = sc.nextDouble();
			
		if(sc.hasNextDouble()){
			val2 = sc.nextDouble();	
			double avg=0;
			avg = (val1 + val2)/2;
			System.out.println("The avg Is : " + avg);
			
		}else {
			System.out.println("2nd value is wrong");
		}
		}
		else {
			System.out.println("1st value is wrong");
		}
		

	}

}
