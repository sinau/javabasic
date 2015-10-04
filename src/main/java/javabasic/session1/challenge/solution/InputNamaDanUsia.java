package javabasic.session1.challenge.solution;

import java.util.Scanner;

public class InputNamaDanUsia {
	public static void main(String[] args) {
		System.out.println("Silahkan masukkan nama dan usia.");
		
		String nama;
		int usia;
		
		Scanner in = new Scanner(System.in);
		nama = in.nextLine();
		usia = in.nextInt();
		System.out.println("Halo " + nama + "\nUsia anda adalah " + usia);
		
		in.close();
	}
}
