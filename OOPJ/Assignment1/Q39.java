import java.util.Scanner;

class Q39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = (years > 5) ? salary * 0.05 : 0;
        System.out.println("Bonus: " + (int)bonus);
    }
}

/* Output:
Enter salary: 
50000
Enter years of service: 
6
Bonus: 2500
*/
