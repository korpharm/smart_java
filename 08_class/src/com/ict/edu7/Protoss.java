package com.ict.edu7;

public class Protoss extends Unit {
String name;
int energy;
boolean fly;

public Protoss() {
	
}

	

	public Protoss(String name, int energy, boolean fly) {
	
	this.name = name;
	this.energy = energy;
	this.fly = fly;
}



	public void decEnergy() {
		energy=energy-2;
		
	}
}
