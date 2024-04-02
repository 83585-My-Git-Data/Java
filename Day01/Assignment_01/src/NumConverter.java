//Q1. Accept a integer number and when the program is executed print the binary, octal and
//hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
//Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())


import java.util.Scanner;

public class NumConverter {

	public static void main(String[] args) {
	int num;
	String bin;
	String oct;
	String hex;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	num = sc.nextInt();
	System.out.println("Your number is : "+num);
	bin = Integer.toBinaryString(num);
	oct = Integer.toOctalString(num);
	hex = Integer.toHexString(num);
	System.out.println("Binary equivalent : "+bin);
	System.out.println("Ocatal equivalent : "+oct);
	System.out.println("Hexadeciaml equivalent : "+hex);
	}

}
