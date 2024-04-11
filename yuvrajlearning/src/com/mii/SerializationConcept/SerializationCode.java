package com.mii.SerializationConcept;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//import java.io.Serializable;
public class SerializationCode {

	public static void main(String[] args)  {

		Student student =new Student("solanki yuvraj","ysolanki@gmail.com",18,"1,2 laxminager soc");
		
		try {
		FileOutputStream fos=new FileOutputStream("D:\\yuvraj1.ws\\yuvrajlearning\\src\\com\\mii\\SerializationConcept\\ob.ser");
		
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(student);
		 
        oos.close();
        fos.close();

        System.out.println("Object is transferred");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	}

}
