package br.com.abc.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
	public static void main(String[] args) {
		Date date = new Date();
		date.setTime(date.getTime() + 3_600_000L);
		System.out.println(date);

		Calendar c = Calendar.getInstance();
		// c.setTime(date);
		if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("\nDomingo é o primeiro dia da semana!");
		}
		System.out.println("\nCalendar() - Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Calendar() - Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Calendar() - Dias do ano: " + c.get(Calendar.DAY_OF_YEAR) + "\n");
		c.add(Calendar.HOUR, 24);
		c.roll(Calendar.MONTH, 9);
		Date date2 = c.getTime();
		System.out.println(date2);
	}
}
