import java.util.Scanner;

class Q20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') System.out.println("Result: " + (a+b));
        else if (op == '-') System.out.println("Result: " + (a-b));
        else if (op == '*') System.out.println("Result: " + (a*b));
        else if (op == '/') System.out.println("Result: " + (a/b));
        else System.out.println("Invalid operator");
    }
}

/* Output:
Enter first number: 
10
Enter second number: 
5
Enter operator (+, -, *, /): 
*
Result: 50
*/
