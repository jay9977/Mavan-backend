package com.ts.Hawthorn24F_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String db_url = "jdbc:mysql://127.0.0.1:3306/college";
		String db_user = "root";
		String db_pwd = "9977";

		Connection connection = DriverManager.getConnection(db_url, db_user, db_pwd);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM student;");

		while (rs.next()) {
			String str = rs.getString("name");
			System.out.println(str);

		}
		connection.close();

	}
}
