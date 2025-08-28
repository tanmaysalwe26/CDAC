import java.util.Scanner;

class Q30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): ");
        int choice = sc.nextInt();

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + (a + b)); break;
            case 2: System.out.println("Result: " + (a - b)); break;
            case 3: System.out.println("Result: " + (a * b)); break;
            case 4: 
                if (b != 0) 
                    System.out.println("Result: " + (a / b)); 
                else 
                    System.out.println("Division by zero not allowed.");
                break;
            default: System.out.println("Invalid choice");
        }
    }
}

/* Output:
Select operation (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): 
1
Enter first number: 
20
Enter second number: 
30
Result: 50
*/
