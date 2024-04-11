//In this example, we are going to copy the values of one object into another using Java constructor.

//Java program to initialize the values from one object to another object.  
package com.mii.yuvrajlearning;

public class  Student6 {

	int id;
	String name;

	Student6(int i, String n) {
		id = i;
		name = n;
	}

	Student6(Student6 s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {

		int i = 111;
		String s = "Karan";

		Student6 s1 = new Student6(i, s);
		Student6 s2 = new Student6(s1);
		s1.display();
		s2.display();
	}
}
