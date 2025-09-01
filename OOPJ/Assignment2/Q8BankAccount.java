class BankAccount {
    String name;
    double balance;
    static double interestRate;

    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account: Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
}

class Q8BankAccount{
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Rohit", 5000);
        BankAccount a2 = new BankAccount("Priya", 15000);

        a1.display();
        a2.display();
    }
}

/*Output
Bank Interest Rate Initialized: 4.0%
Account: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account: Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/
