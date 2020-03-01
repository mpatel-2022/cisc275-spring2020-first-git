//Animal.java 
//Megha Patel

import java.util.*;

class Animal {
	private String name;
	private int legs;

	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}//Animal
	
	//getter for the legs
	public int getLegs() {
		return this.legs;
	}//getLegs

	public String toString() {
		return this.name;
	}//toString
}//class
