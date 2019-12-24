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
		System.out.println("\n*************** PARROT LIVING WITH DOGS : ***************");
		Parrot myParrotliveswithDogs =  new Parrot();
		myParrotliveswithDogs.livingTogether(new Dog());
		myParrotliveswithDogs.sing();
		System.out.println("\n*************** PARROT LIVING WITH CATS : ***************");
		Parrot myParrotliveswithCats =  new Parrot();
		myParrotliveswithCats.livingTogether(new Cat());
		myParrotliveswithCats.sing();
		System.out.println("\n*************** PARROT LIVING WITH ROOSTERS : ***************");
		Parrot myParrotliveswithRoosters =  new Parrot();
		myParrotliveswithRoosters.livingTogether(new Rooster());
		myParrotliveswithRoosters.sing();
		System.out.println("\n*************** PARROT LIVING WITH DUCKS : ***************");
		Parrot myParrotliveswithDucks =  new Parrot();
		myParrotliveswithDucks.livingTogether(new Duck());
		myParrotliveswithDucks.sing();
		System.out.println("\n*************** FISH Implemented by SHARK: ***************");
		Shark myShark = new Shark();
		myShark.sing();
		myShark.walk();
		myShark.swim(); 
		System.out.println("\n*************** FISH Implemented by CLOWNFISH: ***************");
		Clownfish myClown = new Clownfish();
		myClown.sing();
		myClown.walk();
		myClown.swim(); 
		System.out.println("\n*************** SHARK / CLOWNFISH Behaviour : ***************");
		System.out.println("*************** SHARK ***************");
		myShark.sizeColour();
		System.out.println("*************** CLOWNFISH ***************");
		myClown.sizeColour();
	    myClown.jokes();
		System.out.println("*************** SHARK ***************");
	    myShark.eat();
	    System.out.println("\n*************** DOLPHIN Behaviour : ***************");
	    Dolphin dolphin = new Dolphin();
	    dolphin.hasFishBehaviour(new Shark());
	    dolphin.swim();
	    System.out.println("\n*************** BUTTERFLY Behaviour : ***************");
	    Butterfly myButterFly =  new Butterfly();
	    myButterFly.setCaterpiller(false);
	    myButterFly.fly();
	    myButterFly.sing();
	    System.out.println("\n*************** CATERPILLAR Behaviour : ***************"); 
	    Butterfly myCaterpillar =  new Butterfly();
	    myCaterpillar.setCaterpiller(true);
	    myCaterpillar.walk();
	    Animal[] animals = new Animal[]{
				   new Bird(),
				   new Duck(),
				   new Chicken(),
				   new Rooster(),
				   new Parrot(),
				   new Shark(),
				   new Clownfish(),
				   new Frog(),
				   new Dog(),
				   new Butterfly(),
				   new Cat()
				   };
		    int flyCount = 0 ;
		    int walkCount = 0 ;
		    int singCount = 0 ;
		    int swimCount = 0 ;
		    for (Animal animal : animals) {
		    	 System.out.println("\n*************** COUNT OF ANIMAL BEHAVIOUR ***************"); 
			   if(animal.fly())
				   flyCount++;
			    if(animal.walk())
			    	walkCount++;
			    if(animal.sing())
			    	singCount++;
			    if(animal.swim())
			    	swimCount++;
		}
		    System.out.println("\n*************** BEFORE COUNT ***************"); 
		    System.out.println("No.of Animals can fly: " + flyCount);
		    System.out.println("No.of Animals can walk: " + walkCount);
		    System.out.println("No.of Animals can sing: " + singCount);
		    System.out.println("No.of Animals can swim: " + swimCount);
		    
		    Rooster myRstr = new Rooster();
		    List<String> roosterSoundList = new ArrayList<String>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1813501743629786784L;

		{
			    add("Default");
		        add("Danish");
		        add("Dutch");
		        add("Finnish");
		        add("French");
		        add("German");
		        add("Greek");
		        add("Hebrew");
		        add("Hungarian");
		        add("Italian");
		        add("Japanese");
		        add("Portuguese");
		        add("Russian");
		        add("Swedish");
		        add("Turkish");
		        add("Urdu");
			}}; 
			
			for (String lang : roosterSoundList) {
				System.out.println("LANGUAGE:***"+lang+"***");
				myRstr.sing(lang);
			}
		}


}
