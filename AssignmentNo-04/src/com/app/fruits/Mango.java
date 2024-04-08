package com.app.fruits;

public class Mango extends Fruit {
	 public Mango() {}
		
	public Mango(String name, String colour, double weight, boolean isFresh) {
		super();
	}

	@Override
	public String toString() {
		return "\n Name : " +this.name + " \n Colour : "+ this.colour+" \n Weight : "+ this.weight;
	}
	
	@Override
	public String taste() {
		
		return "Sweet"; 
	}
}
