package com.mii.oopsconcept;


//Write a Java program to create a class called Animal with a method called makeSound(). 
//Create a subclass called Cat that overrides the makeSound() method to bark.
 class animal
{
	 void makeSound() {
		System.out.println("animal make sound");
	}
	
}
  class cat extends animal {
	 void makesound() {
		System.out.println("bark");
	}

	
}
public class Inheritance {
	
	public static  void main(String[] args) {
		animal a = new animal();
		cat c = new cat();
		a.makeSound();
		c.makesound();
	}
}