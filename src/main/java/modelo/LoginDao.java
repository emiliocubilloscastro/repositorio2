package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.Conexion;

public class LoginDao {
	
	public static int validar(String username, String password) {
		
		Connection con;
		Conexion cn = new Conexion();
		
		PreparedStatement ps;
		ResultSet rs;
		String us = "";
		int valido = 0;
		String sql = "select * from usuario where username = ? and password = ?";
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return valido;	
		
	}	
		
}