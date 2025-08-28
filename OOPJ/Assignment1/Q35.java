import java.util.Scanner;

class Q35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 35) ? "Pass" : "Fail";
        System.out.println(result);
    }
}

/* Output:
Enter marks: 
28
Fail
*/
