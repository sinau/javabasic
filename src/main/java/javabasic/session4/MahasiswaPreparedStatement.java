package javabasic.session4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaPreparedStatement {
	
	private Connection getConn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/belajarjdbc","root","root");
		return conn;
	}

	public List<Mahasiswa> select() throws ClassNotFoundException, SQLException {
		List<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
		
		PreparedStatement pSelect = getConn().prepareStatement("select nim,nama,alamat,telp from mahasiswa");
		ResultSet rs = pSelect.executeQuery();
		while(rs.next()){
			Mahasiswa mhs = new Mahasiswa();
			
			mhs.setNim(rs.getString("nim"));
			mhs.setNama(rs.getString("nama"));
			mhs.setAlamat(rs.getString("alamat"));
			mhs.setTelp(rs.getString("telp"));
			
			daftarMahasiswa.add(mhs);
		}
		
		return daftarMahasiswa;
	}
	
	public int insert(Mahasiswa mhs) throws ClassNotFoundException, SQLException {
		PreparedStatement pInsert = getConn().prepareStatement("insert into mahasiswa(nim,nama,alamat,telp) values(?,?,?,?)");
		pInsert.setString(1, mhs.getNim());
		pInsert.setString(2, mhs.getNama());
		pInsert.setString(3, mhs.getAlamat());
		pInsert.setString(4, mhs.getTelp());
		return pInsert.executeUpdate();
	}
	
	public int update(Mahasiswa mhs) throws ClassNotFoundException, SQLException {
		PreparedStatement pUpdate = getConn().prepareStatement("update mahasiswa set nama=?, alamat=?, telp=? where nim=?");
		pUpdate.setString(1, mhs.getNama());
		pUpdate.setString(2, mhs.getAlamat());
		pUpdate.setString(3, mhs.getTelp());
		pUpdate.setString(4, mhs.getNim());
		return pUpdate.executeUpdate();
	}
	
	public int deleteById(String nim) throws ClassNotFoundException, SQLException {
		PreparedStatement pDelete = getConn().prepareStatement("delete from mahasiswa where nim=?");
		pDelete.setString(1, nim);
		return pDelete.executeUpdate();
	}
	
}
