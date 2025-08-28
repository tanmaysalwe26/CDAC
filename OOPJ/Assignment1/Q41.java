import java.util.Scanner;

class Q41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int original = n, sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    }
}

/* Output:
Enter number: 
153
153 is an Armstrong number
*/
