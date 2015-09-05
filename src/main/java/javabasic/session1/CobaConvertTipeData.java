package javabasic.session1;

public class CobaConvertTipeData {

	public static void main(String[] args) {
		String angkaString = "10";
		int angkaInt = 10;
		double angkaDouble = 12.5;
		System.out.println(angkaString);
		System.out.println(angkaInt);
		System.out.println(angkaDouble);
		
		String convertString1 = angkaInt + "";
		String convertString2 = convertString1 + angkaString;
		String convertString3 = String.valueOf(angkaDouble);
		System.out.println(convertString1);
		System.out.println(convertString2);
		System.out.println(convertString3);
		
		int convertInt1 = Integer.parseInt(convertString2);
		Integer convertInt2 = (int) angkaDouble;
		Integer convertInt3 = angkaInt;
		System.out.println(convertInt1);
		System.out.println(convertInt2);
		System.out.println(convertInt3);
	}
	
}
