import java.util.Scanner;

class Q36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("Smallest number: " + smallest);
    }
}

/* Output:
Enter numbers: 
12
8
19
Smallest number: 8
*/
