package com.mii.learning1;

public class Has_A_Relationship{
	public String Address;
	public int age;
	public int number;
	public int emp_salary;
	public Has_A_Relationship(String add,int age, int num, int sal){
		this.Address=add;
		this.age=age;
		this.number=num;
		this.emp_salary=sal;
	}
}/*
	public class Has_A_Relationship{
		Emp_detail n;
	public void display(Emp_detail n) {
		System.out.println(n.Address +" "+n.age+" "+n.number+" "+n.emp_salary);
	}
	public static void main(String[] args) {
		Emp_detail emp = new Emp_detail("por",18,8758165,18000);
		Has_A_Relationship d = new Has_A_Relationship();
		d.display(emp);
	}
	}

*/