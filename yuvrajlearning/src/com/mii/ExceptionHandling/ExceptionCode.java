package com.mii.ExceptionHandling;
/*
public class ExceptionCode {

    public static void main(String args[]) {
        int n = 10;
        int a = 11;
        //int data; // Move the declaration outside try block

        try {
            // code that may raise exception
           int  data = n / a;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        // rest code of the program
        System.out.println(data);
    }
}*/
/*
import java.util.*;
public class ExceptionCode {  
  
    public static void main(String[] args) {  
    	 try  
         {  
    		 Scanner sc = new Scanner(System.in);
    		 int n= sc.nextInt();
    		 int key=sc.nextInt();
    		 int arr[]= new int[n] ;  
         
         for(int i=0;i<n;i++) {
        	 arr[i]=sc.nextInt();
         }
         System.out.println(arr[key]); //may throw exception   
         }  
             // handling the array exception  
         catch(ArrayIndexOutOfBoundsException e)  
         {  
             System.out.println(e);  
         }  
         System.out.println("rest of the code");  
    }  
      
} */
/*
public class ExceptionCode {  
	  
    public static void main(String[] args) {  
          
        try  
        {  
        	int a=10;
        	int b=0;
        	int data1=a/b; //may throw exception   
        	
        	System.out.println(data1);
  
        }  
             // handling the exception  
        catch(Exception e)  
        {  
            // generating the exception in catch block  
        System.out.println(" number can not divide by zero"); //may throw exception   
  
        } 
        
        try {
        	String a=null;
        	System.out.println(a);
        }catch(NullPointerException e) {
        	System.out.println("you can not enter null");
        }
    System.out.println("rest of the code");  
    }  
}  */



public class ExceptionCode{    
	 public static void main(String args[]){   
	 //outer try block   
	  try{    
	  //inner try block 1  
	    try{    
	     System.out.println("going to divide by 0");    
	     int b =39/0;    
	   }  
	    //catch block of inner try block 1  
	    catch(ArithmeticException e)  
	    {  
	      System.out.println(e);  
	    }    
	       
	    
	    //inner try block 2  
	    try{    
	    int a[]=new int[5];    
	  
	    //assigning the value out of array bounds  
	     a[5]=4;    
	     }  
	  
	    //catch block of inner try block 2  
	    catch(ArrayIndexOutOfBoundsException e)  
	    {  
	       System.out.println(e);  
	    }    
	  
	      
	    System.out.println("other statement");    
	  }  
	  //catch block of outer try block  
	  catch(Exception e)  
	  {  
	    System.out.println("handled the exception (outer catch)");  
	  }   finally {
		  System.out.println("hello yuvraj");
	  }
	    
	  System.out.println("normal flow..");    
	 }    
	}  