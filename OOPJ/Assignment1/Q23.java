import java.util.Scanner;

class Q23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        switch(op) {
            case '+': System.out.println("Result: " + (a+b)); break;
            case '-': System.out.println("Result: " + (a-b)); break;
            case '*': System.out.println("Result: " + (a*b)); break;
            case '/': System.out.println("Result: " + (a/b)); break;
            default: System.out.println("Invalid operator");
        }
    }
}

/* Output:
Enter first number: 
15
Enter second number: 
3
Enter operator (+,-,*,/): 
/
Result: 5
*/
