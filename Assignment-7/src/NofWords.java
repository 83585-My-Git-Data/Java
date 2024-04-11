import java.util.Scanner;
//import java.util.StringTokenizer;

public class NofWords {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		s = sc.nextLine(); 
		
		String s1[] = s.trim().split(" ");
		System.out.println(s1.length);

		
		
	}
}
