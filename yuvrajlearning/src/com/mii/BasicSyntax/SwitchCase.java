package com.mii.BasicSyntax;

public class SwitchCase {

	public static void main(String[] args) {
		int myDay = 2; // setting the value to test
		switch (myDay) 
		{
		  case 1:
		    System.out.println("Read in the Library");
		    break;
		  case 2:
			  System.out.println("Read at Home");
		    break;
		  case 3:
			  System.out.println("Read in the Garden");
		    break;
		  default:
			  System.out.println("Get some Sleep");
		    break;
		}

	}

}
