public class Main {
    public static void main(String[] args) {

        Owner owner01 = new Owner("Jack", 15);
        Owner owner02 = new Owner("Adam", 38);
        Owner owner03 = new Owner ("Ryan", 40);

        owner01.isEligibleCreditCard();//not entitled to the bank card
        owner02.isEligibleCreditCard();//entitled to the bank card
        owner03.isEligibleCreditCard();//entitled to the bank card

        BankAccount account02 = new BankAccount(owner02, 800);
        BankAccount account03 = new BankAccount(owner03, 900);

        //account with credit card limit
        CreditCard account2WithCreditCard = new CreditCard(owner02, 800, 2000);
        CreditCard account3WithCreditCard = new CreditCard(owner03, 900, 1000);

        //create bank
        Bank bankOtp = new Bank("OTP");

        //add account to the bank
        bankOtp.addAccount(account02);
        bankOtp.addAccount(account03);
        bankOtp.addAccount(account2WithCreditCard);
        bankOtp.addAccount(account3WithCreditCard);

        //deposit
        account2WithCreditCard.deposit(500);

        //withdraw
        account2WithCreditCard.withdraw(300);

        //purchase
        account2WithCreditCard.makePurchase(100);

        //balance request
        bankOtp.displayAccounts();
    }
}
