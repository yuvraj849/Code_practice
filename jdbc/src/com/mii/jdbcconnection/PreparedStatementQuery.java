package com.mii.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementQuery {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	            //creating connection
	            String url="jdbc:mysql://localhost:3306/yuvraj";
	            String username="root";
	            String password="root";
	            Connection con = DriverManager.getConnection(url,username,password);
	            String q="insert into table1(tName,tCity) values(?,?)";
	            
	            //get the prepared statment
	            
	            PreparedStatement pstmt= con.prepareStatement(q);
	            
	            //set the values to query
	            pstmt.setString(1, "yuvraj");
	            pstmt.setString(2, "por");
	            pstmt.executeUpdate();
	            System.out.println("data is inserted");
	            con.close();
	            
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
