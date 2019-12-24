package com.java.singtelpoc;

public class Shark implements Fish{

	@Override
	public void sizeColour() {
		System.out.println("I am large and grey");
		
	}

	@Override
	public boolean eat() {
		System.out.println("I eat other fish");
		return true;
		
	}

	@Override
	public boolean jokes() {
		System.out.println("I don't make Jokes");
		return false;
	}

	@Override
	public boolean fly() {
		System.out.println("I don't fly");
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

}
