package com.mii.oopsconcept;

public class ConstructorOverLoading {
	int id;
	String name;
	int age;
	ConstructorOverLoading(int i, String n){
		 id=i;
		 name=n;
	}
	ConstructorOverLoading(int i, String n, int a){
		 id=i;
		 name=n;
		 age=a;
	}
	void display() {System.out.println(id+""+name+""+age);}
	public static void main(String[] args) {
		
		ConstructorOverLoading c= new ConstructorOverLoading(10,"name");
		ConstructorOverLoading d= new ConstructorOverLoading(10,"name",18);
		c.display();
		d.display();
	}

}
