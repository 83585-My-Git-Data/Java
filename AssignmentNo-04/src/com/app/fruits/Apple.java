package com.app.fruits;

public class Apple extends Fruit {
public Apple() {}
	
//	public Apple(String name, String colour, double weight, boolean isFresh) {
//		super();
//			
//	}

@Override
public String toString() {
	return "Name : " +this.name + "\n Colour : "+ this.colour+"\n Weight : "+ this.weight;
}
	@Override
	public String taste() {
		
		return "Sweet and Sour"; 
	}
}
