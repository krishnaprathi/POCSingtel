package com.java.singtelpoc;

public class Butterfly implements Animal{

	boolean isCaterpiller= false;
	

	public boolean isCaterpiller() {
		return isCaterpiller;
	}

	public void setCaterpiller(boolean isCaterpiller) {
		this.isCaterpiller = isCaterpiller;
	}

	@Override
	public boolean sing() {
		if(isCaterpiller)
		{
			System.out.println("I make sound");
			return false;
		}else{
			System.out.println("I does not make sound");
			return false;
		}
		
		
	}

	@Override
	public boolean walk() {
		if(isCaterpiller)
		{
			System.out.println("I can walk(crawl)");
			return true;
		}else
		{
			System.out.println("I cannot walk");
			return false;
		}
		
	}
	@Override
	public boolean fly() {
		
		if(isCaterpiller)
		{
			System.out.println("I cannot fly ");
			return false;
		}else
		{
			System.out.println("I am flying");
			return true;
		}
		
	}

	@Override
	public boolean swim() {
		System.out.println("I cannot swim");
		return false;
	}
}
