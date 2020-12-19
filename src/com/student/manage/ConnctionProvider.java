package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnctionProvider 
{
	static Connection con;
	public static Connection crateConnection()
	{
		//load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection
			String user="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/studentmanagement";
			con=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
