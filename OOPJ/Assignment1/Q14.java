import java.util.Scanner;

class Q14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4-digit number: ");
        String num = sc.next();

        System.out.println("Reversed number: " + new StringBuilder(num).reverse());
    }
}

/* Output:
Enter 4-digit number: 
1234
Reversed number: 4321
*/
