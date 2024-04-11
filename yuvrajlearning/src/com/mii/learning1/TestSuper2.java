package com.mii.learning1;

class Animal {
	Animal(){
		System.out.println("calling animal constructor");
	}
	void fun() {
		System.out.println("method is calling");
	}
}

class Dog extends Animal {

	Dog(){
		System.out.println("calling dog constructor");
	}
	
	void calling() {
		super.fun();
	}
}

class TestSuper2 {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.calling();
	}
}