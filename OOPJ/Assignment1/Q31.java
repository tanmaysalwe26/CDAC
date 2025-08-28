import java.util.Scanner;

class Q31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int greatest = (a > b) ? a : b;
        System.out.println("Greatest number: " + greatest);
    }
}

/* Output:
Enter first number: 
45
Enter second number: 
30
Greatest number: 45
*/
