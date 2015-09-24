package javabasic.session3;

public class PersegiPanjang1 extends AbstractBangunDatar {

	public PersegiPanjang1() {
		System.out.println("Ini adalah class Persegi Panjang");
	}

	@Override
	public double hitungLuas(int panjang, int lebar) {
		return panjang * lebar;
	}

}
