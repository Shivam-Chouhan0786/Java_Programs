// 1) import package
// 2) load and register driver 
// 3) opening database connection to MySql server
// 4) getting statement object to execute query
// 5) execute query
// 6) close connection


//1) import package
import java.sql.*;
class JDBCCode{
	public static void main(String args[]){
		try{			
			//2) load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//3) opening database connection to mysql server
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3000//shivamdb?//useSSL=false","root","root");
			//04 getting statement object to execute query 
			Statement st= con.createStatement();
			//05 execute query
			ResultSet rs = st.executeQuery("Select * from login where userName='Shivam'");
			//06 close connection
			System.out.println(rs);
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}