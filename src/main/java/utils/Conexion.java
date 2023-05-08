package utils;

import java.sql.Connection;
import java.sql.DriverManager;


//Conexion a la base de datos Mysql

public class Conexion {
	
	Connection con;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db", "root", "");
			
		}catch(Exception e) {

		}
		
		return con;
				
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
