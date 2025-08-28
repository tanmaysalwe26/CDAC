import java.util.Scanner;

class Q8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total purchase amount: ");
        double amount = sc.nextDouble();

        if (amount > 1000) {
            amount = amount - (amount * 0.10);
        }

        System.out.println("Final cost after discount: " + amount);
    }
}

/* Output:
Enter total purchase amount: 
1200
Final cost after discount: 1080.0
*/
