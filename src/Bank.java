import java.util.ArrayList;
public class Bank {

    protected String name;
    private ArrayList<BankAccount> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("The " + name + " Bank accounts:");
        for(BankAccount account : accounts) {
            System.out.println("Account owner: " + account.getOwner().getName() + "," + " age: " + account.getOwner().getAge());
            System.out.println("Account owner current balance: " + account.getBalance());
            if(account.getCreditLimit() == 0.0){
                System.out.println("The account owner does not have a credit limit");
            }else {
                System.out.println("Credit limit of account owner: " + account.getCreditLimit());
            }
        }
    }
}