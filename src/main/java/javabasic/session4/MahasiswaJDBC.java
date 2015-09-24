package javabasic.session4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MahasiswaJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/belajarjdbc","root","root");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select * from mahasiswa");
			while(rs.next()){
				System.out.print(rs.getString("nim") + " ");
				System.out.print(rs.getString("nama") + " ");
				System.out.print(rs.getString("alamat") + " ");
				System.out.print(rs.getString("telp") + " ");
				
				System.out.println();
			}
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
