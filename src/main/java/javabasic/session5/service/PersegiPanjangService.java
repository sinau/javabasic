package javabasic.session5.service;

// ketika class yang dipanggil berada di package yang berbeda, maka harus kita import terlebih dahulu
// kita bisa menggunakan spesifik import, bisa juga global import menggunakan tanda *
// import javabasic.session5.abstractmodel.*;
import javabasic.session5.abstractmodel.BangunDatar;
import javabasic.session5.model.PersegiPanjang;

public class PersegiPanjangService implements BangunDatar {

	private PersegiPanjang persegiPanjang;
	
	public PersegiPanjangService(PersegiPanjang persegiPanjang) {
		this.persegiPanjang = persegiPanjang;
	}
	
	public Double hitungLuas() {
		return (double)(this.persegiPanjang.getPanjang() * this.persegiPanjang.getLebar());
	}

}
