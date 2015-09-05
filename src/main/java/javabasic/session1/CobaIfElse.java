package javabasic.session1;

public class CobaIfElse {
	
	public static void main(String[] args) {
		int nilai = 80;
		
		if(nilai < 50) {
			System.out.println("Anda tidak lulus");
		} else if(nilai >= 50 && nilai <= 70) {
			System.out.println("Anda lulus");
		} else if(nilai > 70) {
			System.out.println("Anda lulus dengan nilai sempurna");
		}
	}

}
