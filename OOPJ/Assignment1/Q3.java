import java.util.Scanner;

class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the transaction amount: ");
		float amt = sc.nextFloat();
		
		if(amt>0){
			System.out.println("Deposit");
		}
		else{
			System.out.println("Withdrawal");
		}
	}
}

/*Output:
D:\CDAC\Java\Module>java Q3
Enter the transaction amount: -800
Withdrawal*/