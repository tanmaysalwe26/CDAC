import java.util.Scanner;

class Q12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Friend 1: ");
        int a = sc.nextInt();
        System.out.println("Enter age of Friend 2: ");
        int b = sc.nextInt();
        System.out.println("Enter age of Friend 3: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Oldest: Friend 1");
        } else if (b > a && b > c) {
            System.out.println("Oldest: Friend 2");
        } else {
            System.out.println("Oldest: Friend 3");
        }

        if (a < b && a < c) {
            System.out.println("Youngest: Friend 1");
        } else if (b < a && b < c) {
            System.out.println("Youngest: Friend 2");
        } else {
            System.out.println("Youngest: Friend 3");
        }
    }
}

/* Output:
Enter age of Friend 1: 
22
Enter age of Friend 2: 
25
Enter age of Friend 3: 
20
Oldest: Friend 2
Youngest: Friend 3
*/
