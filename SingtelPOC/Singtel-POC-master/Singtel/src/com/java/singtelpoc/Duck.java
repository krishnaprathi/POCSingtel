package com.java.singtelpoc;

public class Duck extends Bird{
	
	@Override 
	public boolean sing() {

		System.out.println("Quack, quack");
		return true;
	}
	  @Override
		public boolean swim() {
			System.out.println("I can swim");
			return true;
		}

}
