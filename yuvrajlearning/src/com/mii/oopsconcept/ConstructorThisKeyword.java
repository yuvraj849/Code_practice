package com.mii.oopsconcept;

public class ConstructorThisKeyword {
	int id;
	String name;
	ConstructorThisKeyword(int id, String name){
		this.id=id;
		this.name=name;
	}
	void display() {System.out.println(id+""+name);}
	public static void main(String args[]) {
		
		ConstructorThisKeyword C = new ConstructorThisKeyword(10,"yuvraj");
		C.display();
	}
}
