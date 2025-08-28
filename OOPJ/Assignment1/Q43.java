import java.util.Scanner;

class Q43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

/* Output:
Enter number: 
482
Sum of digits: 14
*/
