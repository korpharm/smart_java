package com.ict.edu7;

public class Terrain extends Unit{
	String name;
	int energy;
	boolean fly;
	
	@Override
	public void decEnergy() {
		energy=energy-5;
		
	}
	
	public Terrain() {
		
	}

	public Terrain(String name, int energy, boolean fly) {
		super();
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	
}
