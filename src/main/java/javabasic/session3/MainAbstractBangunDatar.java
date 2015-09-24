package javabasic.session3;

public class MainAbstractBangunDatar {
	public static void main(String[] args) {
		AbstractBangunDatar persegiPanjang = new PersegiPanjang1();
		AbstractBangunDatar segitiga = new Segitiga1();
		
		System.out.println(persegiPanjang.hitungLuas(15, 5));
		System.out.println(segitiga.hitungLuas(10, 5));
	}
}
