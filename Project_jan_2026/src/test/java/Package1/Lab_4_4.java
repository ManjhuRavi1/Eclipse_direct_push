
package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab_4_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();

        System.out.print("How many product names you want to enter? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name " + (i + 1) + ": ");
            String name = sc.nextLine();
            products.add(name);
        }

        Collections.sort(products);

        System.out.println("\nSorted Product Names:");
        for (String p : products) {
            System.out.println(p);
        }

        sc.close();
    }
}
