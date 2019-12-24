package com.java.singtelpoc;

import java.util.ArrayList;
import java.util.List;


public class Solution {

	public static void main(String[] args) {
		System.out.println("***************  Bird Behaviour : ***************");
		Animal mybird =  new Bird();
		mybird.sing();
		System.out.println("***************  DUCK Behaviour : ***************");
		Animal myDuck =  new Duck();
		myDuck.sing();
		myDuck.swim();
		System.out.println("\n*************** CHICKEN Behaviour : ***************");
		Animal myChicken =  new Chicken();
		myChicken.sing();
		myChicken.fly();
		Animal myRooster =  new Rooster();
		myRooster.sing();
		System.out.println("\n***************ROOSTER Will be extends to chicken except Sing behaviour : *************** \n");
		System.out.println("\n*************** Modeled ROOSTER with Delegation Behaviour : ***************\n");
		RoosterDelegation myRoosterDel =  new RoosterDelegation();
		myRoosterDel.sing();
	}

}
