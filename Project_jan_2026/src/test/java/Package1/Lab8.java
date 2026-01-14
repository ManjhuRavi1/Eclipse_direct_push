
package Package1;

import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        // Same as Lab7: hardcode name and gender, take mobile from input
        String firstName = "Ravindra";
        String lastName = "Manjhu";
        Gender gender = Gender.MALE; // enum instead of char

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine().trim();
        sc.close();

        // You can use either the 4-arg constructor or setMobile after 3-arg
        Person obj = new Person(firstName, lastName, gender, mobile);

        System.out.println("First Name : " + obj.getFirstName());
        System.out.println("Last Name  : " + obj.getLastName());
        System.out.println("Gender     : " + obj.getGender());
        System.out.println("Mobile     : " + obj.getMobile());
    }
}
