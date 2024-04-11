package com.mii.SerializationConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationCode {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			FileInputStream fis=new FileInputStream("D:\\yuvraj1.ws\\yuvrajlearning\\src\\com\\mii\\SerializationConcept\\ob.txt");
			
			ObjectInputStream ois= new ObjectInputStream(fis);
			
			Student student = (Student)ois.readObject();
			student.displayName();
			 
	        ois.close();
	        fis.close();

	        System.out.println("Object is transferred");
			} 
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	}

}
