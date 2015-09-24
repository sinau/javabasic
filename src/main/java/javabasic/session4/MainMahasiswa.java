package javabasic.session4;

import java.sql.SQLException;
import java.util.List;

public class MainMahasiswa {

	public static void main(String[] args) {
		MahasiswaPreparedStatement prep = new MahasiswaPreparedStatement();
		
		try {
			// INSERT
			Mahasiswa mhsInsert = new Mahasiswa();
			mhsInsert.setNim("12309009");
			mhsInsert.setNama("Jojon");
			mhsInsert.setAlamat("Jakarta");
			mhsInsert.setTelp("097863552");			
			if(prep.insert(mhsInsert) >= 1) {
				System.out.println("Insert Mahasiswa Sukses.");
			} else {
				System.out.println("Insert Mahasiswa Gagal!");
			}
			
			// UPDATE
			Mahasiswa mhsUpdate = new Mahasiswa();
			mhsUpdate.setNim("12309009");
			mhsUpdate.setNama("Jajang");
			mhsUpdate.setAlamat("Bandung");
			mhsUpdate.setTelp("0978635765");			
			if(prep.update(mhsUpdate) >= 1) {
				System.out.println("Update Mahasiswa Sukses.");
			} else {
				System.out.println("Update Mahasiswa Gagal!");
			}
			
			// DELETE
			if(prep.deleteById("12309009") >= 1) {
				System.out.println("Delete Mahasiswa Sukses.");
			} else {
				System.out.println("Delete Mahasiswa Gagal!");
			}
			
			// SELECT
			List<Mahasiswa> daftarMahasiswa = prep.select();
			for(Mahasiswa mhs : daftarMahasiswa) {
				System.out.println("nim: "+mhs.getNim());
				System.out.println("nama: "+mhs.getNama());
				System.out.println("alamat: "+mhs.getAlamat());
				System.out.println("telp: "+mhs.getTelp());
				
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
