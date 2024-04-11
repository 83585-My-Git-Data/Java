import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String s;
		String reversed= "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word you want to check for Palindrome : ");
		s = sc.next();

		char ch[] = s.toCharArray();
		for(int i=0; i < ch.length; i++) {
			reversed = ch[i] + reversed  ;
			
		}
		if(s.equals(reversed)) {
			System.out.println(" is Palindrome");
		} 
		else {
			System.out.println(" is not Palindrome");
		}
}
}