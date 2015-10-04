package javabasic.session5.datetime;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Period;

public class CobaJodaTime {
	public static void main(String[] args) {
		Instant instant = new Instant(1000); // 1 detik setelah 1970
		System.out.println(instant);
		
		DateTime dateTime = new DateTime(); //waktu sekarang
		int date = dateTime.getDayOfMonth();
		int month = dateTime.getMonthOfYear(); //dimulai dari 1 hingga 12
		int year = dateTime.getYear();
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		System.out.println(dateTime);
		
		LocalDate birthDay = new LocalDate(1990,1,23);
		birthDay = birthDay.plusYears(55); //ultah ke 55
		int year55 = birthDay.getYear(); //tahun ultah ke 55
		System.out.println(year55);
		
		DateTime now = new DateTime();
		DateTime oneMonthLater = now.plusMonths(1);
		Interval interval = new Interval(now, oneMonthLater);
		System.out.println("interval : " + interval);
		System.out.println("start : " + interval.getStart());
		System.out.println("end : " + interval.getEnd());
		System.out.println("duration : " + interval.toDuration());
		
		Duration duration = new Duration(10000); // 10 detik
		System.out.println("duration : " + duration);
		Duration oneHour = new Duration(1000 * 60 * 60);
		DateTime oneHourLater = now.plus(oneHour);
		System.out.println("one hour later : " + oneHourLater);
		
		Period p = new Period(1000); //1 detik
		System.out.println("period : " + p);
		p = new Period(2,3,9,125); //2 jam 3 menit 9 detik dan 125 mili detik
		System.out.println("period : " + p);
		DateTime startTime = new DateTime(2000,1,1,9,0,0,0); //1 januari 2000 jam 9
		//menambahkan period ke instant untuk mendapatkan instant baru
		DateTime endTime = startTime.plus(p);
		System.out.println("end time : " + endTime);		
		//Mengubah Period ke durasi harus ada waktu awal,
		//kemudian ditambah dengan period dapat waktu akhir dan dihitung durasinya
		Hours hours = Hours.hoursBetween(startTime,endTime);
		//mendapatkan durasi dalam jam dengan tipe data int
		int hoursBetween = hours.getHours();
		System.out.println("hours duration : " + hoursBetween);
		Minutes minutes = Minutes.minutesBetween(startTime, endTime);
		System.out.println("minutes duration : " + minutes.getMinutes());
	}
}
