class BasicBankAccount {
    String accountHolder;
    double balance;

    BasicBankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.println("AccountHolder=" + accountHolder + ", Balance=" + balance);
    }
}

class Q12BankAccountBasic{
    public static void main(String[] args) {
        BasicBankAccount acc = new BasicBankAccount("Ravi", 10000);
        acc.display();
    }
}

/*Output
AccountHolder=Ravi, Balance=10000.0
*/
