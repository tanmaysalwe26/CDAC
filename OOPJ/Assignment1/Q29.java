import java.util.Scanner;

class Q29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day type (1–Workday, 2–Weekend): ");
        int type = sc.nextInt();

        if (type == 1) {
            System.out.println("It’s workday. Time to work.");
        } else if (type == 2) {
            System.out.println("It’s weekend. No work today.");
        } else {
            System.out.println("Invalid input");
        }
    }
}

/* Output:
Enter day type (1–Workday, 2–Weekend): 
2
It’s weekend. No work today.
*/
