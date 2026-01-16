
package Package1;

import java.util.*;

public class Lab_2_2 {

    public static class Person {
        private String name;
        private float age;

        public Person(String name, float age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public float getAge() { return age; }
    }

    public static class Account {

        protected String accNum;
        protected double balance;
        protected Person accHolder;

        public Account() {}

        public Account(String accNum, Person accHolder, double balance) {
            this.accNum = accNum;
            this.accHolder = accHolder;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) balance += amount;
        }

        public boolean withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public static String generate() {
            long time = System.currentTimeMillis();
            int random = new Random().nextInt(900) + 100;
            return time + "" + random;
        }

        public double getBalance() { return balance; }
        public String getAccNum() { return accNum; }
    }

    public static class SavingsAccount extends Account {

        private final double minimumBalance;

        public SavingsAccount(String accNum, Person accHolder, double balance, double minimumBalance) {
            super(accNum, accHolder, balance);
            this.minimumBalance = minimumBalance;
        }

        @Override
        public boolean withdraw(double amount) {
            if (balance - amount >= minimumBalance) {
                balance -= amount;
                return true;
            }
            System.out.println("Withdrawal denied: Maintain Minimum Balance of " + minimumBalance);
            return false;
        }
    }

    public static class CurrentAccount extends Account {

        private double overdraftLimit;

        public CurrentAccount(String accNum, Person accHolder, double balance, double overdraftLimit) {
            super(accNum, accHolder, balance);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public boolean withdraw(double amount) {
            if (balance + overdraftLimit >= amount) {
                balance -= amount;
                return true;
            }
            System.out.println("Withdrawal denied: Exceeds overdraft limit.");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person p = new Person("Rahul", 25);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose: ");
        int ch = sc.nextInt();

        String acNo = Account.generate();
        Account acc;

        if (ch == 1) {
            acc = new SavingsAccount(acNo, p, 2000, 500);
            System.out.println("Note: Maintain Minimum Balance");
        } else {
            acc = new CurrentAccount(acNo, p, 2000, 1000);
        }

        System.out.print("Enter deposit: ");
        acc.deposit(sc.nextDouble());
        System.out.println("Balance: " + acc.getBalance());

        System.out.print("Enter withdraw: ");
        boolean success = acc.withdraw(sc.nextDouble());
        if (!success && ch != 1) {
        }

        System.out.println("Final Balance: " + acc.getBalance());
        System.out.println("Account No: " + acNo);

        sc.close();
    }
}
