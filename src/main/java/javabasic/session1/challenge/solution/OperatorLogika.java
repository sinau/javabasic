package javabasic.session1.challenge.solution;

public class OperatorLogika {

	public static void main(String[] args) {
		int panjang = 20;
		int lebar = 15;
		int tinggi = 12;
		
		boolean banding1 = (panjang > lebar) && (lebar < tinggi);
		boolean banding2 = false || true;
		boolean banding3 = !false;
		
		System.out.println(banding1);
		System.out.println(banding2);
		System.out.println(banding3);
	}

}
