
package Package1;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter purchase date (yyyy-MM-dd): ");
            String input = sc.nextLine();

            System.out.print("Enter number of warranty years: ");
            int y = sc.nextInt();

            System.out.print("Enter number of warranty months: ");
            int m = sc.nextInt();

            LocalDate inputDate = LocalDate.parse(input);
            LocalDate warrantyEndDate = inputDate.plusYears(y).plusMonths(m);

            System.out.println("Warranty expires on: " + warrantyEndDate);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter date in yyyy-MM-dd format.");
        } finally {
            sc.close();
        }
    }
}
