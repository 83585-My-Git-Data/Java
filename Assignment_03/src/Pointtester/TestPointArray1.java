//Q1. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2) Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit




package Pointtester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nofpts;
		int choice;
		System.out.println("Enter the no. of points you want to plot : ");
		nofpts = sc.nextInt();
		
		Point2D[] points = new Point2D[nofpts];
		
		for(int i =0; i<points.length ;i++) {
			points[i] = new Point2D();
			points[i].accept();
			
		} 
		
		do {
			System.out.println("Choose Your Options : ");
			System.out.println("Press 0 :Exit");
			System.out.println("Press 1 :Display details of a specific point");
			System.out.println("Press 2 :Display x, y co-ordinates of all points ");
			System.out.println("Press 3 :2 indices for the points , validate the indices");
			choice = sc.nextInt();
			switch (choice) {
			case 0:System.out.println("Byeeeeee !!!!!!");
				break;
				
			case 1: 
				System.out.println("Enter the INDEX of which cords you want to see : ");
				int subscript = sc.nextInt();
				if(subscript>=0 && subscript<points.length) {
					System.out.println(points[subscript].getDetails());
				}
				else{
				System.out.println("Invalid Index !!!");
			}
			break;
				
			case 2: for (int i = 0; i<points.length; i++) {
				System.out.println(points[i].getDetails());
			}
			break;
			case 3:int index1, index2;
            System.out.println("Enter first index:");
            index1 = sc.nextInt();
            System.out.println("Enter second index:");
            index2 = sc.nextInt();
            if (index1 >= 0 && index1 < nofpts && index2 >= 0 && index2 < nofpts) {
                double distance = points[index1].calculateDistance(points[index2]);
                System.out.println("Distance between points at index " + index1 + " and " + index2 + ": " + distance);
            } else {
                System.out.println("Invalid indices.");
            }
			default:System.out.println("Wrong Choice !!!!");
				break;
			}
			
		} while (choice!=0);
		

	}
	

}
