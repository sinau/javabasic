package javabasic.session5;

import javabasic.session5.abstractmodel.BangunDatar;
import javabasic.session5.model.PersegiPanjang;
import javabasic.session5.model.Segitiga;
import javabasic.session5.service.PersegiPanjangService;
import javabasic.session5.service.SegitigaService;

public class MainBangunDatar {
	public static void main(String[] args) {
		// pada bagian ini kita menggunakan konsep OOP yaitu polimorfisme yang telah kita pelajari sebelumnya
		
		Segitiga segitigaMdl = new Segitiga(5, 7);
		BangunDatar segitiga = new SegitigaService(segitigaMdl);
		
		PersegiPanjang persegiPanjangMdl = new PersegiPanjang(10, 5);
		BangunDatar persegiPanjang = new PersegiPanjangService(persegiPanjangMdl);
		
		System.out.println("Luas Persegi Panjang adalah = " + persegiPanjang.hitungLuas());
		System.out.println("Luas Segitiga adalah = " + segitiga.hitungLuas());
	}
}
