package com.java.singtelpoc;

public class Parrot extends Bird{
 
   Animal animal=null;
   void livingTogether(Animal animal)
   {
	 this.animal =animal;
	  
   }
	  public boolean sing() {
if(null==animal)
{
	 this.livingTogether(new Duck());
}
		animal.sing();
		return true;
	}

}
