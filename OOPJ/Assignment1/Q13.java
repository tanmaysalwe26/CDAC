import java.util.Scanner;

class Q13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total classes held: ");
        int total = sc.nextInt();
        System.out.println("Enter classes attended: ");
        int attended = sc.nextInt();
        System.out.println("Medical cause (Y/N): ");
        char medc = sc.next().charAt(0);

        double attendance = (attended * 100.0) / total;

        if (attendance >= 75 || medc == 'Y') {
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
60
Medical cause (Y/N): 
Y
Student is allowed to sit for the exam.
*/
