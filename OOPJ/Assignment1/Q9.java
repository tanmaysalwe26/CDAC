import java.util.Scanner;

class Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();
        System.out.println("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus.");
        }
    }
}

/* Output:
Enter salary: 
50000
Enter years of service: 
6
Bonus amount: 2500
*/
