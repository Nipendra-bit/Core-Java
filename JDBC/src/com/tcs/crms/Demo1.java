package com.tcs.crms;

import java.sql.*;
import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		
		try {
			String url="jdbc:mysql://localhost:3306/demo";
			String username="root";
			String password="root12";
			String query="select emp_id,salary from employee where first_name like '%Mic%'";
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //load the MySQL JDBC Driver Class 
			Connection con=DriverManager.getConnection(url,username,password);
			
			System.out.println("Connection established successfully");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println(rs.getString("emp_id"));
				System.out.println(rs.getInt("salary"));
			}
			
			stmt.close();
			
			con.close();
			
			System.out.println("Connection closed");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
