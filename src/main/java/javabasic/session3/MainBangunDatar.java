package javabasic.session3;

public class MainBangunDatar {
	public static void main(String[] args) {
		BangunDatar persegiPanjang = new PersegiPanjang2();
		BangunDatar segitiga = new Segitiga2();
		
		System.out.println(persegiPanjang.hitungLuas(10, 5));
		System.out.println(segitiga.hitungLuas(7, 5));
	}
}
