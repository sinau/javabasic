package javabasic.session5.datetime;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;

public class CobaPerpustakaan {
	public static void main(String[] args) {
		// jika buku yang dikembalikan lebih dari 3 hari maka dikenakan denda
		// jika terlambat lebih dari 1 hari maka denda perhari 5000
		// jika terlambat kurang dari 1 hari maka denda perjam 100
		
		DateTime tglPinjam = new DateTime(2015,10,5,11,0,0,0);
		DateTime tglSeharusnyaKembali = tglPinjam.plusDays(3);
		DateTime tglKembali1 = new DateTime(2015,10,8,13,0,0,0);
		DateTime tglKembali2 = new DateTime(2015,10,10,13,0,0,0);
		
		// kasus 1 terlambat perjam
		Days kembali1 = Days.daysBetween(tglSeharusnyaKembali, tglKembali1);
		int jumlahHari1 = kembali1.getDays();
		if(jumlahHari1 > 0) {
			System.out.println("Anda terlambat " + jumlahHari1 + " hari. Anda dikenai denda perhari 5000");
			System.out.println("Denda anda adalah: " + jumlahHari1 * 5000);
		} else {
			Hours jamKembali = Hours.hoursBetween(tglSeharusnyaKembali, tglKembali1);
			int jumlahJam = jamKembali.getHours();
			if(jumlahJam > 0) {
				System.out.println("Anda terlambat " + jumlahJam + " jam. Anda dikenai denda perjam 100");
				System.out.println("Denda anda adalah: " + jumlahJam * 100);
			} else {
				System.out.println("Anda Mengembalikan tepat waktu!");
			}			
		}
		
		// kasus 2 terlambat perhari
		Days kembali2 = Days.daysBetween(tglSeharusnyaKembali, tglKembali2);
		int jumlahHari2 = kembali2.getDays();
		if(jumlahHari2 > 0) {
			System.out.println("Anda terlambat " + jumlahHari2 + " hari. Anda dikenai denda perhari 5000");
			System.out.println("Denda anda adalah: " + jumlahHari2 * 5000);
		} else {
			Hours jamKembali = Hours.hoursBetween(tglSeharusnyaKembali, tglKembali1);
			int jumlahJam = jamKembali.getHours();
			if(jumlahJam > 0) {
				System.out.println("Anda terlambat " + jumlahJam + " jam. Anda dikenai denda perjam 100");
				System.out.println("Denda anda adalah: " + jumlahJam * 100);
			} else {
				System.out.println("Anda Mengembalikan tepat waktu!");
			}			
		}
	}
}
