package javabasic.session1.challenge.solution;

public class OperatorAritmatika {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 20;
		
		int resultJumlah = var1 + var2;
		int resultPengurangan = var1 - var2;
		int resultPerkalian = resultJumlah * resultPengurangan;
		double resultPembagian = (double) resultPerkalian / 9;
		double resultMod = resultPembagian % 12;
		
		System.out.println("Penjumlahan: " + resultJumlah);
		System.out.println("Pengurangan: " + resultPengurangan);
		System.out.println("Perkalian: " + resultPerkalian);
		System.out.println("Pembagian: " + resultPembagian);
		System.out.println("Modulus: " + resultMod);
	}
}
