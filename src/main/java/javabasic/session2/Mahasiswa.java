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
	
	public String hitungNilai(Integer nilai) {
		String result = "";
		if(nilai > 80) {
			result = "A";
		} else if(nilai >= 70 && nilai <= 80) {
			result = "B";
		} else if(nilai >= 50 && nilai < 70) {
			result = "C";
		} else if(nilai >= 30 && nilai < 50) {
			result = "D";
		} else if(nilai < 30) {
			result = "E";
		}
		
		return result;
	}

}
