package javabasic.session2;

public class MainMahasiswa {

	public static void main(String[] args) {
		String nama = "joni";
		Mahasiswa mhs = new Mahasiswa(nama);
		String nilai = mhs.hitungNilai(75);
		System.out.println("Nilai anda adalah: "+nilai);
	}

}
