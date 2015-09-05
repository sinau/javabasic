package javabasic.session1;

public class CobaCodeBlock {

	static String varClass = "ini variable milik class";
	
	public static void main(String[] args) {
		System.out.println(varClass);
		
		int var1 = 1;
		
		{
			int var2 = 2;
			System.out.println(var1);
			System.out.println(var2);
		}
		
		// diluar sini var2 tidak dikenali karena berada didalam block
		System.out.println(var1);
		
		{
			// didalam block ini var2 juga tidak dikenali, karena berada dalam block yang berbeda
			String var3 = "block 2";
			
			// varClass dan var1 masih dikenali karena berada diblock yang lebih atas
			System.out.println(varClass);
			System.out.println(var1);
			System.out.println(var3);
			
			{
				// didalam block ini var3 dapat dikenali karena posisinya berada diblock yang lebih atas
				System.out.println(var3);
			}
		}
	}

}
