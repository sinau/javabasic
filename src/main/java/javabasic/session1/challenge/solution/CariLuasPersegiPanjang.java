package javabasic.session1.challenge.solution;

import java.util.Scanner;

public class CariLuasPersegiPanjang {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int panjang;
		int lebar;
		int luas;
		
		System.out.println("Masukkan panjang: ");
		panjang = in.nextInt();
		System.out.println("Masukkan lebar: ");
		lebar = in.nextInt();
		
		luas = panjang * lebar;
		System.out.println("Luas Persegi Panjang= " + luas);
		
		in.close();
	}
}
