package com.DB;
import java.sql.*;
public class DBConnect {
	private static Connection conn;
	public static Connection getConnection() {
		try {
			if(conn==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage1","root","12320110047743#");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
