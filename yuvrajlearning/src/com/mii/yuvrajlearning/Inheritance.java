package com.mii.yuvrajlearning;
import com.mii.learning1.*;
/*

 class Employee{
	  int yu=10;
	 Employee(int y){
		  yu=y;
	 }
 
 }
  public class Inheritance extends Employee {
	 
	  public Inheritance (int yu) {
		  super(yu);
		//Inheritance I = new Inheritance();
		System.out.println(this.yu);
	}
	  public static void main(String[] args) {
	        //Inheritance I = new Inheritance(10); // Creating an instance of Inheritance with a value for 'yu'
	    }
}
*/
/*
class animal{
	String d="bow";
	 animal() {
		System.out.println(this.d);
	}
	 cat() {
		System.out.println("meow");
		}
	}


public class Inheritance extends animal{
	
	public static void main(String arg[]) {
		Inheritance I = new Inheritance();
		
		I.dog();
	}
}*/

/*
 class yuvraj{
	//public static  void main(String[] args) {}
	Stu9 stu9= new Stu9();
	int y= stu9.a;

}
public class Inheritance extends yuvraj{
	public static void main(String[] args) {
		yuvraj yuv = new yuvraj();
		System.out.println("");
		
	}
}
*/
public class Inheritance{
	Has_A_Relationship n;
public void display(Has_A_Relationship n) {
	System.out.println(n.Address +" "+n.age+" "+n.number+" "+n.emp_salary);
}
public static void main(String[] args) {
	Has_A_Relationship emp = new Has_A_Relationship("por",18,8758165,18000);
	Inheritance d = new Inheritance();
	d.display(emp);
}
}
