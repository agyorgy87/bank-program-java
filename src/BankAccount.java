public class BankAccount {

    private Owner owner;
    protected double balance;

    public BankAccount(Owner owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return 0;
    }

    //deposit
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " dollars deposited into your account.");
        } else {
            System.out.println("Enter the amount you wish to deposit.");
        }
    }

    //withdraw
    public boolean withdraw(double amount) {
        if (amount == 0) {
            System.out.println("Enter the amount you wish to withdraw.");
            return false;
        } else if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Successful cash withdrawal, " + amount + "dollar");
            return true;
        } else {
            System.out.println("There is currently not enough money in your account.");
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "Account balance: " + balance + "dollar";
        String result2 = super.toString();
        return result + result2;
    }

}