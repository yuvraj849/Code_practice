package com.mii.oopsconcept;

public class CopyConstructor {
	
	int id;
	String name;
	CopyConstructor(int i,String n){
		id=i;
		name=n;
	}
	CopyConstructor(CopyConstructor c){
		id=c.id;
		name= c.name;
	}
	
	void display() {
		System.out.println(id+""+name);
	}
	public static void main(String[] args) {
		
		CopyConstructor cc= new CopyConstructor(10,"yuvraj");
		CopyConstructor ccc = new CopyConstructor(cc);
		cc.display();
		ccc.display();
	}

}
