class BankAcc {
    String accountHolder;
    double balance;

    BankAcc(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    void display() {
        System.out.println("AccountHolder=" + accountHolder + ", Balance=" + balance);
    }
}

class Q13BankDepositWithdraw {
    public static void main(String[] args) {
        BankAcc a1 = new BankAcc("Ravi", 5000);
        BankAcc a2 = new BankAcc("Priya", 8000);

        a1.deposit(2000);
        a2.withdraw(3000);

        a1.display();
        a2.display();
    }
}

/*Output
AccountHolder=Ravi, Balance=7000.0
AccountHolder=Priya, Balance=5000.0
*/
