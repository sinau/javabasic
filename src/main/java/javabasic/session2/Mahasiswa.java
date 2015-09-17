package javabasic.session2;

public class Mahasiswa {

	public Mahasiswa() {
		System.out.println("Selamat datang!");
	}
	
	public Mahasiswa(String nama) {
		System.out.println("Halo "+nama+" selamat datang!");
	}
	
	public void kirimPesan(String pesan) {
		System.out.println("Pesan anda adalah "+pesan);
	}
	
	public Boolean hitungNilai(Integer nilai) {
		return nilai > 60 ? true : false;
	}

}
