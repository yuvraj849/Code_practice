package com.mii.yuvrajlearning;
/*
import com.mii.learning1.Stu9;

public class Stu7 {

	/*
	public static class Stu8{
		public static int x=10;
	}*/
/*
	public static void main(String[] args) {	
		/*
		int y = Stu8.x;//ahiya apde code my badhe static use karya che atle apde direct asscess kari sakeye che
		//if we create obj and call the method then its store extra space in memory so we call method diretly

		System.out.println(""+y);
		*/
	/*	
		Stu9 stu9  = new Stu9();
	}

}*/

 
public class Stu7{ 
	public static class Student{  
		int rollno;  
		String name;  
		float fee;  
		Student(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
		}  
	
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}
}  
// another method
/*
class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
class TestThis3{  
public static void main(String args[]){  
Student s1=new Student(114,"ankit",5000f);  
Student s2=new Student(116,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
*/