package com.java.singtelpoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void test() {
		
		//assertEquals
		Animal myDuck =  new Duck();
		assertEquals(true, myDuck.sing());
		assertEquals(true, myDuck.swim());
		Animal myChicken =  new Chicken();
		assertEquals(true, myChicken.sing());
		assertEquals(false, myChicken.fly());
		Animal myRooster =  new Rooster();
		assertEquals(true, myRooster.sing());
		
		//assertTrue
		Shark myShark = new Shark();
		assertTrue(myShark.swim());
		
		
		//assertFalse
		assertFalse(myShark.sing());
		assertFalse(myShark.sing());
		
		//assertNull
		Animal myRoosternull = null ;
		assertNull(myRoosternull);
		
		//assertNotNull
		assertNotNull(myShark);
		Clownfish myClown = new Clownfish();
		assertEquals(false, myClown.sing());
		assertEquals(false, myClown.walk());
		assertEquals(true, myClown.swim());
		assertEquals(true, myClown.jokes());
		Butterfly myButterFly =  new Butterfly();
		assertEquals(true, myButterFly.fly());
		assertEquals(false, myButterFly.sing());
	}

}
