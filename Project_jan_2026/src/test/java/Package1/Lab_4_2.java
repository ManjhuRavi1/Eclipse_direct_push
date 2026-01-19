package Package1;

import java.io.File;
import java.util.Scanner;

public class Lab_4_2 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Ravindra.5.Kumar\\git\\Jan2026\\Project_jan_2026\\src\\test\\java\\Package1\\numbers.txt");
            System.out.println("Working dir: " + new File(".").getAbsolutePath());
            System.out.println("numbers.txt exists: " + f.exists() + " | path: " + f.getAbsolutePath());

            Scanner sc = new Scanner(f);
            sc.useDelimiter("[,\\s]+");
            boolean any = false;
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    int n = sc.nextInt();
                    if ((n & 1) == 0) {
                        System.out.println(n);
                        any = true;
                    }
                } else {
                    sc.next();
                }
            }
            sc.close();
            if (!any) System.out.println("(no even numbers found or parsing failed)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



