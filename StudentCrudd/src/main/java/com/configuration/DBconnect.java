package com.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect 
{
private static String url ="jdbc:mysql://localhost:3306/dbase";
private static String username="root";
private static String password="password";
public static Connection getConnect()
{
	Connection con = null;
	try { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		con =DriverManager.getConnection(url, username, password);
		System.out.println(con);
	}catch(SQLException | ClassNotFoundException e ) {
		e.printStackTrace();
	}
	return con;
}
}
