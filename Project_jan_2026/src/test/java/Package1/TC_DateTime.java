package Package1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;


public class TC_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

		Instant currenttime=Instant.now();
		System.out.println("Current Time:"+currenttime);
		
		LocalDate now = LocalDate.now();
		LocalDate Independance = LocalDate.of(1947,  Month.AUGUST, 15);
		Period period = Independance.until(now);

		
		System.out.println("Now : " + now.format(formatter));
		System.out.println("Independance : " + Independance.format(formatter));
		System.out.println("Tomorrow : " + now.plusDays(1));
		System.out.println("Last Month : "+ now.minusMonths(1));
		System.out.println("Leap Year : " + now.isLeapYear());
		System.out.println("Move To 3oth Day : " + now.withDayOfMonth(30));
		
		System.out.println("Days : " + period.get(ChronoUnit.DAYS));
		System.out.println("Months : " + period.get(ChronoUnit.MONTHS));
		System.out.println("Years : " + period.get(ChronoUnit.YEARS));

		
		
		
		ZonedDateTime ct=ZonedDateTime.now();
		ZonedDateTime ctinparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("India Time:"+ct);
		System.out.println("Paris Time:"+ctinparis);
		
		
		
	}

}
