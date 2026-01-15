package Package1;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab12 {
	
	 public static void calculateAndPrint(LocalDate startDate, LocalDate endDate) {
	        Period period = Period.between(startDate, endDate);

	        System.out.println("\n--- Duration ---");
	        System.out.println("Years  : " + period.getYears());
	        System.out.println("Months : " + period.getMonths());
	        System.out.println("Days   : " + period.getDays());
	    }
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a date (format: yyyy-MM-dd): ");
        String input = sc.nextLine();
        
        System.out.println("Enter a date (format: yyyy-MM-dd): ");
        String input2 = sc.nextLine();

        LocalDate inputDate = LocalDate.parse(input);
        LocalDate inputDate2 = LocalDate.parse(input2);

        calculateAndPrint(inputDate, inputDate2);

        sc.close();
    }
}
