import java.util.Scanner;

class Q40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double finalCost = (amount > 1000) ? amount * 0.9 : amount;
        System.out.println("Total cost after discount: " + finalCost);
    }
}

/* Output:
Enter purchase amount: 
1200
Total cost after discount: 1080
*/
