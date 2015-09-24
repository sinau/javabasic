package javabasic.session1;

public class CobaContinue {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i == j) {
					continue;
				}
				
				if(j < i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
