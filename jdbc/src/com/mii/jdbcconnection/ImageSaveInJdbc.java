package com.mii.jdbcconnection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageSaveInJdbc {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	            //creating connection
	            String url="jdbc:mysql://localhost:3306/yuvraj";
	            String username="root";
	            String password="root";
	            Connection con = DriverManager.getConnection(url,username,password);
	            String q="insert into images(pic)values(?)";
	            
	            //get the prepared statment
	            
	            PreparedStatement pstmt= con.prepareStatement(q);
	            
	            //set the image to query
	            FileInputStream fis =new  FileInputStream("C:\\Users\\YuvrajSolanki\\Pictures\\Screenshots\\flag-india.jpg");
	            pstmt.setBinaryStream(1, fis,fis.available());
	            pstmt.executeUpdate();
	            System.out.println("img is inserted");
	            con.close();
	            
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
