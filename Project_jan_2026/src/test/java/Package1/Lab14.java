package Package1;


import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Zone ID (e.g., America/New_York): ");
        String zoneId = sc.nextLine();

        
            ZonedDateTime currentDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
            System.out.println("Current date and time in " + zoneId + ": " + currentDateTime);
            sc.close();
        
    }
}
