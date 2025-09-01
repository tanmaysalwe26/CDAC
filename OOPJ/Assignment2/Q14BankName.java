class NamedBankAccount {
    String accountHolder;
    double balance;
    static String bankName = "CDAC Bank";

    NamedBankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

class Q14BankName {
    public static void main(String[] args) {
        NamedBankAccount.displayBankName();
        NamedBankAccount acc = new NamedBankAccount("Ravi", 6000);
        System.out.println("Account Created for " + acc.accountHolder);
    }
}

/*Output
Bank Name: CDAC Bank
Account Created for Ravi
*/
