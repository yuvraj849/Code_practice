// method and function is same

package com.mii.yuvrajlearning;
/*
import java.util.Scanner; 
public class Method {
	public static void findEvenOdd(int num)  {  
		//method body  
		if(num%2==0)   
		System.out.println(num+" is even");   
		else   
		System.out.println(num+" is odd");  
		} 
	public static void main(String[] args) {
		//creating Scanner class object     
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reading value from user  
		int num=sc.nextInt();  
		//method calling  
		findEvenOdd(num);  

	}
	/*public static void findEvenOdd(int num)  {  
	//method body  
	if(num%2==0)   
	System.out.println(num+" is even");   
	else   
	System.out.println(num+" is odd");  
	}  

}
*/
/*
public class Method{
	
	public static void main(String[] args) {
		
		
		
		Method M = new Method();
		
		System.out.println("addition of number is "+M.add(10,15));
	}
	int s;
	
	public int add(int a, int b) {
		s= a+b;
		return s;
	}
}*/


public class Method{
	
	int age=0;
	String name;
	
	
	public void setName(String n) {
		this.name = n;
		
	}
	public void setAge(int a) {
		this.age = a;
		
	}
	public String getName() {
		return this.name;
		
	}
	public Integer getAge() {
		return this.age;
	}
	public static void main(String[] args) {
		Method M = new Method();
		M.setAge(34);
		System.out.println(M.getAge());
	}

}