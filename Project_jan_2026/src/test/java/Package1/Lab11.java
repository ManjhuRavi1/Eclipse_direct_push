package Package1;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a date (format: yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate inputDate = LocalDate.parse(input);
        LocalDate today = LocalDate.now();

        DateDurationCalculator.calculateAndPrint(inputDate, today);

        sc.close();
    }
}

class DateDurationCalculator {
    public static void calculateAndPrint(LocalDate startDate, LocalDate endDate) {
        Period period = Period.between(startDate, endDate);

        System.out.println("\n--- Duration ---");
        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());
    }
}