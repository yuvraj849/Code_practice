package com.mii.jdbcconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mii.jdbcpratice.GetCon;

public class SelectJdbc {

	public static void main(String[] args) {

		try {
			
			Connection con=GetCon.getConnection();
			String q="select * from table1";
			
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String city=set.getString(3);
				System.out.println(id+" : "+name+" : "+city);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
