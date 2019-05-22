package JDBC.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import JDBC.table.studentTable;


//type information
public class JDBCoperate {
	
	private static final String SQL = "SELECT * From students WHERE FEE <=?";

	public static void main(String[] args) throws SQLException {
		
		//class.forName(com.mysql.jdbc.Driver);
		
		double maxfee;
		try {
			
			
			
			maxfee = inputDataForm.getInt("Enter a max fee");
			
//			
		
		
//		studentTable.getStudent(rs);
//		
//		rs.last();
//		System.out.println("Last studnet is :  " + rs.getInt("id")+" "+ rs.getString("first_name")+ " "+rs.getString("first_name") + " " + rs.getDate("dob"));
//		
//		rs.first();
//		System.out.println("First studnet is :  " + rs.getInt("id")+" "+ rs.getString("first_name")+ " "+rs.getString("first_name") + " " + rs.getDate("dob"));
//
//		rs.absolute(3);
//		System.out.println("Studnet is :  " + rs.getInt("id")+" "+ rs.getString("first_name")+ " "+rs.getString("first_name") + " " + rs.getDate("dob"));
		
//			
		
	}catch(Exception e){
		System.err.print("Error: invalid number");
		return;
		
	}
	
	ResultSet rs=null;
	
	try {
			Connection con = DBConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.setDouble(1, maxfee);
			//ResultSet rs = stmt.executeQuery("SELECT * FROM students");
			rs=stmt.executeQuery();
			studentTable.getStudents(rs);
	}catch(SQLException e){
		System.err.print(e);
		
	}finally {
		if(rs != null) {
			rs.close();
		}
	}
		
		
		
		
		
//	finally {
//		if(rs !=null) {
//			rs.close();
//		}
////		if(stmt != null) {
////			stmt.close();
////		}
////		if(con != null) {
////			con.close();
////		}
//	}
		
	}
}
