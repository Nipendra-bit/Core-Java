package com.tcs.crms;
// batch processing !
import java.sql.*;
public class Demo4 {

	public static void main(String[] args) {
		
		try {
			String url="jdbc:mysql://localhost:3306/demo";
			String username="root";
			String password="root12";
			String query="insert into student values(?,?,?)";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Thread.sleep(2000);
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			System.out.println("Connection is established");
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1,101);
			pstmt.setString(2,"Nipendra");
			pstmt.setInt(3,22);
			pstmt.addBatch();
			
			pstmt.setInt(1,102);
			pstmt.setString(2,"Garima");
			pstmt.setInt(3,21);
			pstmt.addBatch();
			
			pstmt.setInt(1,103);
			pstmt.setString(2,"Shivam");
			pstmt.setInt(3,12);
			pstmt.addBatch();
			
			//pstmt.executeBatch();
			
			int[] result=pstmt.executeBatch();
			
			System.out.println("Data is inserted affected rows "+result.length);
			
			pstmt.close();
			
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
