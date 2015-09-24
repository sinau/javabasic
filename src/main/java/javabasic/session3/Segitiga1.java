package javabasic.session3;

public class Segitiga1 extends AbstractBangunDatar {

	public Segitiga1() {
		System.out.println("Ini adalah class Segitiga");
	}

	@Override
	public double hitungLuas(int panjang, int lebar) {
		return (double)((panjang*lebar)/2.0);
	}

}
