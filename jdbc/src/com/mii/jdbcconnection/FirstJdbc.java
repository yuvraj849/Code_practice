package com.mii.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) {
		 try{
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            //creating connection
	            String url="jdbc:mysql://localhost:3306/yuvraj";
	            String username="root";
	            String password="root";
	            Connection con = DriverManager.getConnection(url,username,password);
	            
	            //create a query
	            String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null , tcity varchar(400))";
	            //create statment
	            
	            Statement stmt = con.createStatement();
	            stmt.executeUpdate(q);
	            System.out.println("table is created");
	            con.close();
	          /*  if(con.isClosed()){
	                System.out.println("connection is close");
	            }else{
	                System.out.println("connection is created");
	            }*/
	        }catch(Exception e){

	            e.printStackTrace();
	        }

	}

}
