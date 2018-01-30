package com.jwt.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRegisterDAO {
	public void insertData(String name, String pass) throws Exception {
		System.out.println("jdbc connection");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien", "root", "123456");

		try {

			try {
				Statement st = con.createStatement();
				int value = st.executeUpdate("INSERT INTO  test(name,pass) "
								+ "VALUES('"
								+ name
								+ "','"
								+ pass
								+ "')");
				System.out.println("1 row affected" + value);
			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
