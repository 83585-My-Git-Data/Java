//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food deatils. Only display the total of orderd
//food)

import java.util.Scanner;

public class Canteen {

	public static void main(String[] args) {
		int bill=0;
		int choice;
		int quantity = 0;
		
		do {
			
			System.out.println("Choose your Item : ");
			System.out.println("Press 1 ->  Samosa: --------------  RS 10");
			System.out.println("Press 2 -> Idli	 : --------------  RS 15");
			System.out.println("Press 3 -> Dosa	 : --------------  RS 30");
			System.out.println("Press 4 -> Vada	 : --------------  RS 25");
			System.out.println("Press 5 -> Generate Bill and Exit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();		
			
			switch (choice) {
			case 1:System.out.println("Samosa");
			System.out.println("Enter the Quantity : ");
			quantity = sc.nextInt();
			bill =+10*quantity;
				break;
				
			case 2:System.out.println("Idli");
			System.out.println("Enter the Quantity : ");
			quantity = sc.nextInt();
			bill =+15*quantity;
				break; 
				
			case 3:System.out.println("Dosa");
			System.out.println("Enter the Quantity : ");
			quantity = sc.nextInt();
			bill =+30*quantity;
				break;
			
			case 4:System.out.println("Vada");
			System.out.println("Enter the Quantity : ");
			quantity = sc.nextInt();
			bill =+25*quantity;
				break;
			
			case 5:System.out.println("Your final bill is : ");
					
					System.out.println(bill);
//					choice = 5;
			
				break;

			default: System.out.println("Wrong Choice !!!! ");
				break;
			}
			
		} while (choice != 5);
		
		

	}

}
