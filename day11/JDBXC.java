package addon_day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBXC {
public static void main(String[] args) throws ClassNotFoundException ,SQLException
{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test_db";
		String username="root";
		String password="";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		String query="create table student(id int,name varchar(20),age int)";
		stmt.executeUpdate(query);
		System.out.println("table created successfully");
}
}

//while(rs.next()) {
	//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//}

