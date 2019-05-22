package JDBC.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String USERNAME = "awais";
	private static final String PASSWORD = "awais";
	private static final String CONN = "jdbc:mysql://localhost:8889/school";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(CONN, USERNAME, PASSWORD);

	}

}
