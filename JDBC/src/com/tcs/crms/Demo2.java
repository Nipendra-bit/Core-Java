package com.tcs.crms;
//statement!
import java.sql.*;
public class Demo2 {

	public static void main(String[] args) {
		
		try {
			String url="jdbc:mysql://localhost:3306/college";
			String username="root";
			String password="root12";
			String query="select * from student";

		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			System.out.println("Connection Established");
			
			PreparedStatement stmt=con.prepareStatement(query);
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				int ID=rs.getInt("ID");
				String name=rs.getString("name");
				
				System.out.println("ID: "+ID+" "+"Name: "+name);
			}
			
			stmt.close();
			con.close();
			System.out.println("Connection Closed");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

