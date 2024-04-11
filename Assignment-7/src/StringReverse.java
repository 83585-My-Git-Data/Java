import java.util.Scanner;

public class StringReverse {
	

	public static void main(String[] args) {
		String s;
		String reversed= "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word you want to reverse : ");
		s = sc.next();

		char ch[] = s.toCharArray();
		for(int i=0; i < ch.length; i++) {
			reversed = ch[i] + reversed  ;
			
		}
		System.out.println(reversed);

	} 
	

		
	

}
