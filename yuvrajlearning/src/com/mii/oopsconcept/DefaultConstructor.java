package com.mii.oopsconcept;

public class DefaultConstructor {
	
	int id;
	String name;
	
	
	void display() {System.out.println(id+" "+name);}
	
	public static void main(String[] args) {
		
		DefaultConstructor s = new DefaultConstructor();
		
		s.display();
		
		
	}

}
