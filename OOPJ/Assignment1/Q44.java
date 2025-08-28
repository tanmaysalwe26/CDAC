import java.util.Scanner;

class Q44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4-digit number: ");
        int n = sc.nextInt();

        int original = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        System.out.println("Reversed number: " + rev);
        System.out.println("Palindrome: " + (rev == original ? "Yes" : "No"));
    }
}

/* Output:
Enter 4-digit number: 
1221
Reversed number: 1221
Palindrome: Yes
*/
