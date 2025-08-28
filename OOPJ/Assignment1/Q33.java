import java.util.Scanner;

class Q33 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(result);
    }
}

/* Output:
Enter a number: 
17
Number is Odd
*/
