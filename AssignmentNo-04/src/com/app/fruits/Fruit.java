package com.app.fruits;
//import java.util.Objects;
import java.util.Scanner;

public class Fruit {
	String name;
	String colour;
	double weight;
	public boolean isFresh = true;
	
	public Fruit(){
	
	}
//	public Fruit(String name, String colour, double weight, boolean isFresh) {
////		super();
//		this.name = name;
//		this.colour = colour;
//		this.weight = weight;
//		this.isFresh = isFresh;
//	}
	
	
	

	public boolean isFresh() {
		return isFresh;
	}
	
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name : " +this.name + "Colour : "+ this.colour+"Weight : "+ this.weight;
	}


	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fruit Name : ");
		name = sc.nextLine();

		System.out.println("Enter the Fruit Colour: ");
		colour = sc.nextLine();

		System.out.println("Enter the Fruit Weight : ");
		weight = sc.nextDouble();

	}

	public void display() {
		System.out.println("Fruit : " + name);
		System.out.println("Fruit Colour : " + colour);
		System.out.println("Fruit weight : " + weight);
		
	}
	
	
	public String taste() {
			
			return "No Taste !!!"; 
		}
}
















