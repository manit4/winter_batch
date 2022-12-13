import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBC_12_12 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/winter", "root", "root");
		
		PreparedStatement pstmt =  conn.prepareStatement("select * from user");
		
		ResultSet resultset =  pstmt.executeQuery();
		
		while(resultset.next()) {
			
			int id = resultset.getInt(1);
			String name = resultset.getString(2);
			
			System.out.println(id+", "+name);	
		}
	
	}
}



//public class JDBC_12_12 {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/winter", "root", "root");
//		
//		PreparedStatement pstmt =  conn.prepareStatement("update user set name = ? where id = ?");
//		
//		pstmt.setString(1, "Prasanna");
//		pstmt.setInt(2, 100);
//		
//		System.out.println(pstmt.toString());//it will return you fired query if you wish to see the query generated....
//		
//		pstmt.executeUpdate();
//	}
//}


//public class JDBC_12_12 {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/winter", "root", "root");
//		
//		System.out.println("Enter your Id!!");
//		
//		int id = sc.nextInt();
//		
//		System.out.println("Enter your Name!!");
//		
//		String name = sc.next();
//		
//		PreparedStatement pstmt =  conn.prepareStatement("insert into user (id, name) values(?, ?)");
//		
//		pstmt.setInt(1, id);
//		pstmt.setString(2, name);
//		
//		pstmt.executeUpdate();
//	}
//}


//public class JDBC_12_12 {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/winter", "root", "root");
//		
//		Statement statement = conn.createStatement();
//		
//		System.out.println("Enter your Id!!");
//		
//		int id = sc.nextInt();
//		
//		System.out.println("Enter your Name!!");
//		
//		String name = sc.next();
//		
//		statement.executeUpdate("insert into user (id, name) values("+id+", '"+name+"')");
//		
//	}
//}


//public class JDBC_12_12 {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/winter", "root", "root");
//		
//		Statement statement = conn.createStatement();
//		
//		statement.execute("create table user (id int(10), name varchar(20))");
//		conn.close();
//	}
//}
