package com.mii.learning1;
/*
public class Instance_Initializer_Block {
	 
	    int speed;  
	      
	    Instance_Initializer_Block(){System.out.println("speed is "+speed);}  
	   
	    {speed=100;}  
	       
	    public static void main(String[] args){  
	    //Instance_Initializer_Block b1=new Instance_Initializer_Block();  
	    Instance_Initializer_Block b2=new Instance_Initializer_Block();  
	          
	}  
}
*/
/*
class Bike8{  
    int speed;  
      
    Bike8(){System.out.println("constructor is invoked");}  
   
    {System.out.println("instance initializer block invoked");}  
       
    public static void main(String args[]){  
    Bike8 b1=new Bike8();  
   // Bike8 b2=new Bike8();  
    }      
} 
*/

class Instance_Initializer_Block {  
	 private void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
		 Instance_Initializer_Block d1=new Instance_Initializer_Block();  
	  d1.eat();  
	 }  
	} 