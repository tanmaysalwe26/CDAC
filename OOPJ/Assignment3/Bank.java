import java.util.Scanner;

class Bank{
	private double balance;
	
	void deposit(double amount){
		this.balance+=amount;
	}
	
	void withdraw(double amount){
		if(this.balance>amount){
			this.balance-=amount;
		}
		else{
			System.out.println("Insufficient balance");
			this.balance
		}
	}
	double getBalance(){
		return this.balance;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Bank b1 = new Bank();
		
		System.out.println("Enter the deposit amount: ");
		double dep= sc.nextDouble();
		b1.deposit(dep);
		
		System.out.println("Enter the withdraw amount: ");
		double with= sc.nextDouble();
		b1.withdraw(with);
		
		System.out.println();
		System.out.println("Updated balance: "+b1.getBalance());
	}
}