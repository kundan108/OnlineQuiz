package onlinequiz.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn= null;
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@//localhost:49161/xe";
			String username="onlinequiz";
			String pwd="kundna";
			conn=DriverManager.getConnection(url,username,pwd);
			System.out.println("Connection Successfully Opne");
		}catch(SQLException ex) {
			
		}catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return conn;
	}
	public static void closeConnection() {
		if(conn!=null) {
			try {
				conn.close();
				System.out.println("Connection close successfully!");
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
