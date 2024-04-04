import java.util.Scanner;


public class CalculateDrivingCalculator {
	
	private double totalMiles;
	private double costPerGallon;
	private double milage;
	private double parkingFees;
	private double tolls;
	private double totalExp;
	private double avg;
	Scanner sc = new Scanner(System.in);
	
	public void acceptDetails()
	{
		System.out.println("TOTAL MILES DRIVEN PER DAY :");
		totalMiles = sc.nextDouble();
		
		System.out.println("COST PER GALLON OF GASOLINE :");
		costPerGallon = sc.nextDouble();
		
		System.out.println("Average miles per Gallon : ");
		milage = sc.nextDouble();
		
		System.out.println("PARKNG FEES PER DAY :");
		parkingFees = sc.nextDouble();
		
		System.out.println("TOLLS PER DAY : ");
		tolls =sc.nextDouble();		
	}
	
	public void displayDetails()
	{
		System.out.println("TOTAL MILES DRIVEN PER DAY :" + totalMiles);
		System.out.println("COST PER GALLON OF GASOLINE : " + costPerGallon);
		avg = (totalMiles/ milage)*costPerGallon;
		System.out.println("AVERAGE MILES PER GALLON : "+ avg);
		System.out.println("PARKING FEES PER DAY : " + parkingFees);
		System.out.println("Tolls per Day : "+ tolls);
		totalExp = avg + parkingFees +tolls;
		System.out.println("Total Expenditure :" + totalExp);
		System.out.println("Total amount you saved per day when you used car pooling : " + totalExp);
		
}

	public static void main(String[] args) {
		
		CalculateDrivingCalculator cd = new CalculateDrivingCalculator();
		
		cd.acceptDetails();
		cd.displayDetails();
		
	}

}
