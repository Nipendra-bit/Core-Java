package com.tcs.crms;
//JDBC connection using the prepared statement.
import java.sql.*;

public class Demo3 {

	public static void main(String[] args) {
		
		try {
			String url="jdbc:mysql://localhost:3306/demo";
			String username="root";
			String password="root12";
			String query="select * from employee where salary >= ? and first_name like ?";
			
			System.out.println("Setting up connection");
			Thread.sleep(2000);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			System.out.println("Connection is established");
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 50000);
			pstmt.setString(2, "%mich%");
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				int salary=rs.getInt("salary");
				System.out.println(salary);
			}
			
			System.out.println("Connection is closed");
			pstmt.close();
			
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
