package com.mii.BasicSyntax;

public class HolloSquare {

	public static void main(String[] args) {
		 for (int i = 1; i <= 5; i++) {
	            // Inner loop for columns
	            for (int j = 1; j <= 5; j++) {
	                // Print asterisk if it's the first or last row, or the first or last column
	               if (/*i == 1 || i == 5 || */j == 1 || j == 5) {
	                    System.out.print(j);
	                } else {
	                    System.out.print(" ");
	                }
	            	//System.out.print(j);
	            }
	            // Move to the next line after printing each row
	            System.out.println();
	        }

	}

}
