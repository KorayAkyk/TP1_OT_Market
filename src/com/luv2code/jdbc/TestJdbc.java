package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/magasin?useSSL=false";
		String user = "magasin";
		String pass = "magasin";
		
		try
		{
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection OK");
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
	}

}
