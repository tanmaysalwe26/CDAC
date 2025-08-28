import java.util.Scanner;

class Q25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        switch (n) {
            case 1: System.out.println("You selected option 1."); break;
            case 2: System.out.println("You selected option 2."); break;
            case 3: System.out.println("You selected option 3."); break;
            case 4: System.out.println("You selected option 4."); break;
            case 5: System.out.println("You selected option 5."); break;
            default: System.out.println("Invalid option.");
        }
    }
}

/* Output:
Enter a number: 
3
You selected option 3.
*/
