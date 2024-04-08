package FruitTester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int choice;
		int index = 0;
		Fruit f;
		
		System.out.println("Enter the Size of Basket !!!! ");
		size = sc.nextInt();
		Fruit f1 = new Fruit();
		Fruit []basket = new Fruit[size];
		
		do {
			System.out.println("Press 0: To Exit ");
			System.out.println("Press 1: To Add Apple");
			System.out.println("Press 2: To Add Mango");
			System.out.println("Press 3: To Add Orange");
			System.out.println("Press 4: To Display Name of All fruits");
			System.out.println("Press 5: Display name,color,weight, taste of all fresh fruits,in the basket.");
			System.out.println("Press 6: Mark Fruitas Stale");
			System.out.println("Press 7: Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("Press 8: Mark all sour fruits Stale ");
			choice = sc.nextInt(); 
			
			switch (choice) {
			case 0: 
				System.out.println("Byeeee !!!!!");
				break; 
			
			case 1:if(index<size) {
				f = new Apple();
				f.accept();
				basket[index] = f;
				index++;
			}
			else {
				System.out.println("Basket is Fulll ");
			}
					
			break;
			
			
			case 2: 
				if(index<size) {
					f = new Mango();
					f.accept();
					basket[index] = f;
					index++;
				}
				else {
					System.out.println("Basket is Fulll ");
				}
			break;
			
			case 3: 
				if(index<size) {
					f = new Orange();
					f.accept();
					basket[index] = f;
					index++;
				}
				else {
					System.out.println("Basket is Fulll ");
				}
			break;
			
			case 4: 
				for(int i = 0; i<index; i++) {
//					System.out.println(basket[i]);
					System.out.println(basket[i].getName());
				}
			break;
			
			case 5:    // name,color,weight , taste of all fresh fruits
				for(int i = 0; i<index; i++) {
//					System.out.println(basket[i]);
					System.out.println(basket[i].toString());
					System.out.println(basket[i].taste());
				}
			break;
			
			case 6: int stale;
			System.out.println("Enter the Stale Fruit");
			stale = sc.nextInt();
			for(int i = 0; i<index; i++) {
				if(stale<index)
				basket[stale].setFresh(false);
			}
			break;
			
			case 7:
				for(int i = 0 ; i<index; i++) {
					if(basket[i].isFresh == false) {
						System.out.println(basket[i].toString());
					}
				}
			break;

			default: System.out.println("Wrong Choice !!!! ");
				break;
			}
			
				
		} while (choice !=0);
		
	}

}
