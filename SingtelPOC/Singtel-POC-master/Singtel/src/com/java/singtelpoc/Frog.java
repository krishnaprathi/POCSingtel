package com.java.singtelpoc;

public class Frog implements Animal{

	@Override
	public boolean walk() {
		System.out.println("I cannot walk");
		return false;
		
	}
	
	@Override
	public boolean fly() {
		System.out.println("I can fly");
		return true;
		
	}

	@Override
	public boolean sing() {
		System.out.println("Beck, beck");
		return true;
		
	}

	@Override
	public boolean swim() {
		System.out.println("I can swim");
		return true;
	}

}
