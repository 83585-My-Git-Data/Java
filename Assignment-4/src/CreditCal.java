import java.util.Scanner;

public class CreditCal {
	
	private int accno;
	private double pbal;
	private double credUse;
	private double credlim;
	double repay;
	double newbal;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account Number : ");
		accno = sc.nextInt();
		
		System.out.println("Enter your Credit Limit : ");
		credlim = sc.nextDouble();
		
		System.out.println("Enter the amount of Credit used : ");
		credUse = sc.nextDouble();
		
		System.out.println("Enter Your Pending Balance from last month : ");
		pbal = sc.nextDouble();
		
		System.out.println("Enter the amount You Repaid : ");
		repay = sc.nextDouble();
	}
	
	
	public void display() {
		System.out.println("Your Account Number is : " +accno);
		System.out.println("Your Credit Limit is : " +credlim);
		System.out.println("The amount of Credit You used : " +credUse);
		System.out.println("Your Last month pending balance is : " +pbal);
		System.out.println("Balance you RE-Paid is  : " +repay);
		newbal = pbal +credUse-repay ;
		System.out.println("******************************************");
		System.out.println("New Balance for next Month is : " +newbal);
		if(newbal>credlim) {
			System.out.println("Your Credit Limit Exceeded !!!");
		}
		else {
			System.out.println("Your Credit Limit  not Exceeded !!!");
		}
			
	}
	
	
	
	public static void main(String[] args) {
		CreditCal cc = new CreditCal();
		cc.accept();
		cc.display();
		
	}

} 


