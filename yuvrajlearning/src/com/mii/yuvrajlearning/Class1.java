package com.mii.yuvrajlearning;
/*
//In this example, we have created a Student class which has two data members id and name. 
//We are creating the object of the Student class by new keyword and printing the object's value

class Student{
	int id;
	String name;
	
}
public class Class1 {

	public static void main(String[] args) {
		Student S1 = new Student();// creating object
//Initializing objects  
		S1.id =1;
		S1.name = "yuvraj";
		//printing data
		System.out.println(S1.id+" "+S1.name);

	}

}
*/
//In this example, we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method.
//Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
/*	class Student{
 
		int id;
		String name;
	//initializing the value to these objects by invoking the insertRecord method
		void InsertManually(int r , String n) {
			id = r;
			name = n;
		}
	//Here, we are displaying the state (data) of the objects by invoking the displayInformation() method
		void print() {System.out.println(id +" "+ name);}
	}
	public class Class1 {
	public static void main(String[] args) {
	
		Student s1= new Student();
		Student s2= new Student();
		
		s1.InsertManually(10, "yuvraj");
		s2.InsertManually(11, "sanket");
		s1.print();
		s2.print();

	}
}*/

// There is given another example that maintains the records of Rectangle class.
/*
class Rectangle {
	int length;
	int width;
	void insertdata(int l, int w) {
		length =l;
		width = w;
	}
	void PrintArea() {
		System.out.println(length*width);
}
}
public class Class1{
public static void main(String[] args ) {
	Rectangle R1 = new Rectangle();
	Rectangle R2 = new Rectangle();
	R1.insertdata(10, 11);
	R2.insertdata(12, 13);
	R1.PrintArea();
	R2.PrintArea();
}
}
*/
//Calling method through an anonymous object
//factorial program using class and object
/*class Factorial{
	
	void Fact(int n) {
		int fact1 = 1;
		for(int i=1;i<=n;i++ ) {
			fact1=fact1*i;
		}
		System.out.print(fact1);
	}
	
}
public class Class1{
public static void main(String[] args) {
	Factorial F1 = new Factorial();
	//Factorial F2 = new Factorial();
	F1.Fact(5);
}
}*/
//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  
/*
class Account{
	
	int acc_no;
	String name;
	float amount;
	
	void Insert(int acc, String n, float amt) {
		acc_no = acc;
		name = n;
		amount = amt;
		
	}
	void DepositMoney(float amt) {
		amount = amount+amt;
	}
	void WithdrawMoney(float amt) {
		if(amount<amt) {
			System.out.println("insuffisent balance");
		}else {
			amount=amount-amt;
			System.out.println(amount);
		}
	}
	void Checkbalance() {
		System.out.println("your balance is "+ amount);
	}
	void dispaly() {
		System.out.println(acc_no + name + amount);
	}
}
public class Class1{
	public static void main(String[] args) {
		Account A1= new Account();
		//A1.Insert(1,"yuvraj",1000);
		//A1.dispaly();
		A1.Checkbalance();
		//A1.dispaly();
		//A1.DepositMoney(2000);
		//A1.Checkbalance();
		//A1.WithdrawMoney(500);
		//A1.DepositMoney(2000);
		//A1.dispaly();
		//A1.WithdrawMoney(500);
		//A1.dispaly();

	}

}*/

/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat*/
/*
class employees{
	String name;
	int year;
	String address;
	void emp(String n,int y, String a) {
		name=n;
		year=y;
		address=a;
	}
	void print() {
		System.out.println(name+" "+year+" "+address);
	}
	
}
public class Class1{
public static void  main(String[] args) {
	employees E1= new employees();
	System.out.println("name"+" "+"year"+" "+"address");
	E1.emp("Robert",1994,"64c-wallsstrret");
	E1.print();
}
}*/
/*Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than 500$.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.*/

/*
 class Employee{
	int hours;
	int salary;
	void getInfo(int h, int s) {
		hours=h;
		salary=s;
	}
	
	void Addsal() {
		if(salary>500) {
			salary=salary+20;
		}
	}
	void AddWork(){
		if(hours<=5) {
			salary=salary+5;
		}
	}
	void display() {
		System.out.println(salary+" "+hours);
	}
	
}
 
 public class Class1{
	 public static void main(String[] args) {
		 Employee E1= new Employee();
		 E1.getInfo( 6, 500);
		 E1.Addsal();
		 E1.AddWork();
		 E1.display();
	 }
 }*/
/*
class Employee {
    int hours;
    int salary;

    void getInfo(int h, int s) {
        hours = h;
        salary = s;
    }

    void Addsal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    void AddWork() {
        if (hours > 6) {
            salary += 5;
        }
    }

    void display() {
        System.out.println(salary);
    }
}

public class Class1 {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.getInfo(7, 500);
        E1.Addsal();
        E1.AddWork(); // You need to call AddWork() to apply its logic
        E1.display();
    }
}
*/
