package com.mii.learning1;

class a{
	
	a fun() {
		
		System.out.println("hello");
		return this;
	}
}
class b extends a{
	b fun() {
		
		System.out.println("hii");
		return this;
	}
}
public class CovariantReturnType {

	public static void main(String[] args) {
		b sc = new b();
		System.out.println(sc.fun());
		
	}

}
