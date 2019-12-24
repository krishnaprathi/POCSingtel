#Code Assignment for Java Developer 

Animal.java and Fish.java are written as interfaces 

Bird implements Animal
Shark/Clownfish implements Fish

All the question asked were printed in sop in Solution.java

Interface and class blocks image attached 

roosterSoundList is the Sound made in different languages

#JUnit  test cases written in MyUnitTest.java 

covering methods **assertEquals** 	**assertTrue** 	**assertFalse**  **assertNull** and **assertNotNull**

#API Design :

Need to use unique URIs to the different resource.

#GET /animals
for returning all animals (Assuming have Dog and Cat are the only animals)

{
   "animals":[
      {
      "type":"dog",
      "walk":"I am walking",
      "fly":"I cannot fly",
      "sing":"Woof, woof",
      "swim":"I can swim"
      }
        {
      "type":"cat",
      "walk":"I am walking",
      "fly":"I cannot fly",
      "sing":"Meow",
      "swim":"I can swim"
      }
   ]
}



To get a particular animal for eg: Dog/cat

#GET /animals?type=dog
Response should be like below in JSON for dog

{"animal":{"type":"dog","walk":"I am walking","fly":"I cannot fly","sing":"Woof, woof","swim":"I can swim"}}

#GET /animals?type=cat
Response should be like below in JSON for cat

{"animal":{"type":"cat","walk":"I am walking","fly":"I cannot fly","sing":"Meow","swim":"I can swim"}}

