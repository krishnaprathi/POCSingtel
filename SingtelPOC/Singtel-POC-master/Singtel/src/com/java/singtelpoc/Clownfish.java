package com.java.singtelpoc;

public class Clownfish implements Fish{

	@Override
	public boolean fly() {
		
			System.out.println("I cannot fly");
			return false;
			
	}

	@Override
	public boolean sing() {
		System.out.println("I don't sing");
		return false;
		
	}

	@Override
	public boolean walk() {
		System.out.println("I don't walk");
		return false;
		
	}

	@Override
	public boolean swim() {
		System.out.println("I can swim");
		return true;
		
	}

	@Override
	public void sizeColour() {
		System.out.println("I am small and colourful(orange)");
		
	}

	@Override
	public boolean eat() {
		System.out.println("I dont eat other fish");
		return false;
		
	}

	@Override
	public boolean jokes() {
		System.out.println("I make Jokes");
		return true;
		
	}

}
