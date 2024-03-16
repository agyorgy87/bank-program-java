public class CreditCard extends BankAccount {

    private double creditLimit;

    public CreditCard(Owner owner, double balance, double creditLimit) {
        super(owner, balance);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public boolean makePurchase(double amount) {

        double totalAmountAvailable = balance + creditLimit;

        if(totalAmountAvailable >= amount) {
            this.balance -= amount;
            System.out.println("Successful purchase.");
            return true;
        }else{
            System.out.println("Unsuccessful purchase.");
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "Credit card limit: " + creditLimit + "dollar," + " Account balance: " + balance + "dollar";
        return result;
    }

}