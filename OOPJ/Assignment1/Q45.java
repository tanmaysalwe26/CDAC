import java.util.Scanner;

class Q45 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a > b) { int t = a; a = b; b = t; }
        if (a > c) { int t = a; a = c; c = t; }
        if (b > c) { int t = b; b = c; c = t; }

        System.out.println("Ascending order: " + a + ", " + b + ", " + c);
    }
}

/* Output:
Enter numbers: 
45
12
78
Ascending order: 12, 45, 78
*/
