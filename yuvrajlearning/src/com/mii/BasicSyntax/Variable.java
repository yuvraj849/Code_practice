package com.mii.BasicSyntax;


class Guru99 {
	int data = 99;
    static int a ;
    static int b = 2;//static variable  
    //int data = 99; //instance variable  
    void method() {
        int b = 90; //local variable  
    }
}
public class Variable {

	public static void main(String[] args) {
		Guru99 G = new Guru99();
		
		System.out.print(G.b);

	}

}
