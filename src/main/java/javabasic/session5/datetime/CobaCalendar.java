package javabasic.session5.datetime;

import java.util.Calendar;

public class CobaCalendar {
	public static void main(String[] args) {
		// untuk fungsi perhitungan gunakanlah class Calendar
		Calendar calendar = Calendar.getInstance();
		int tahun = calendar.get(Calendar.YEAR);
		int bulan = calendar.get(Calendar.MONTH); // dimulai dari 0 sampai 11
		int tanggal = calendar.get(Calendar.DATE);
		int hari = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(tahun);
		System.out.println(bulan);
		System.out.println(tanggal);
		System.out.println(hari);
		
		calendar.add(Calendar.DATE, 1); //menambah satu hari
		calendar.add(Calendar.HOUR, 1); //menambah satu jam
		calendar.add(Calendar.YEAR, -1); //mengurangi satu tahun
		
		tahun = calendar.get(Calendar.YEAR);
		bulan = calendar.get(Calendar.MONTH); // dimulai dari 0 sampai 11
		tanggal = calendar.get(Calendar.DATE);
		hari = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(tahun);
		System.out.println(bulan);
		System.out.println(tanggal);
		System.out.println(hari);
	}
}
