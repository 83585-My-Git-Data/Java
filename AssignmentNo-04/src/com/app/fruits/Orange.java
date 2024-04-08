package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {

	}

	public Orange(String name, String colour, double weight, boolean isFresh) {
		super();
	}
	
	@Override
	public String toString() {
		return "Name : " +this.name + " \n Colour : "+ this.colour+" \n Weight : "+ this.weight;
	}

	@Override
	public String taste() {

		return "Sour";
	}
}
