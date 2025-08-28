import java.util.Scanner;

class Q32 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String result = (n > 0) ? "Number is Positive" : (n < 0) ? "Number is Negative" : "Number is Zero";
        System.out.println(result);
    }
}

/* Output:
Enter a number: 
-12
Number is Negative
*/
