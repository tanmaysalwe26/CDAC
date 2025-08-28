import java.util.Scanner;

class Q34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        String result = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
        System.out.println(result);
    }
}

/* Output:
Enter age: 
20
Eligible to vote
*/
