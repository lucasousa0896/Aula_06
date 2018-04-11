package DAO;

import java.sql.Connection; 
import java.sql.DriverManager;  
import java.sql.SQLException;


public class ConnectionFactory
{
	static 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			throw new RuntimeException(e);
		}
	}
	
	public static Connection CriarConexao() throws SQLException
	{
		return DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=A1a@123456");
	}
}
