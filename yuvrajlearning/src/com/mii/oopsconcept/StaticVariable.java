package com.mii.oopsconcept;
/*
public class StaticVariable {
	 int id;
	 String name;
	 static String college="parul";
	 StaticVariable(int id,String name){
		 this.id =id;
		 this.name=name;
	 }
	 void display() {System.out.println(id+""+name+""+college);}
	public static void main(String[] args) {
		StaticVariable S=new StaticVariable(10,"yuvraj");
		S.display();
		//StaticVariable.college="parul university";
		
	}

}*/
public class StaticVariable {
	 int id;
	 String name;
	 static String college="parul";
	 static void change() {
		 college="parul university";
	 }
	 StaticVariable(int id,String name){
		 this.id =id;
		 this.name=name;
	 }
	 void display() {System.out.println(id+""+name+""+college);}
	public static void main(String[] args) {
		StaticVariable.change();
		StaticVariable S=new StaticVariable(10,"yuvraj");
		S.display();
		//StaticVariable.college="parul university";
		
	}

}