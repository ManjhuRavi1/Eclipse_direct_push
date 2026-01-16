package Package1;

public class Current_Account extends Account {
    private final double overdraftLimit;
 
    public Current_Account(Person1 holder, double openingBalance, double overdraftLimit) {
        super(holder, openingBalance);
        this.overdraftLimit = overdraftLimit;
    }
 
    public double getOverdraftLimit() { return overdraftLimit; }
 
    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (balance - amount < -overdraftLimit) return false;
        balance -= amount;
        return true;
    }
}
