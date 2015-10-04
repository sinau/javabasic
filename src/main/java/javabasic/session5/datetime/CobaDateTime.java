package javabasic.session5.datetime;

import java.util.Date;

public class CobaDateTime {
	public static void main(String[] args) {
		// class Date dijava fungsi-fungsinya sudah banyak yang usang, sebaiknya digunakan untuk menyimpan tanggal saja
		Date dt = new Date();
		int tahun = dt.getYear();
		int bulan = dt.getMonth();
		int tanggal = dt.getDate();
		Long waktuSekarang = dt.getTime();
		
		System.out.println(tahun);
		System.out.println(bulan);
		System.out.println(tanggal);
		System.out.println(waktuSekarang);
		
	}
}
