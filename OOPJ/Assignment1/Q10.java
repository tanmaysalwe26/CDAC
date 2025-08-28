import java.util.Scanner;

class Q10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total classes held: ");
        int total = sc.nextInt();
        System.out.println("Enter classes attended: ");
        int attended = sc.nextInt();

        double attendance = (attended * 100.0) / total;

        if (attendance >= 75) {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }
    }
}

/* Output:
Enter total classes held: 
100
Enter classes attended: 
78
Student is allowed to sit for the exam.
*/
