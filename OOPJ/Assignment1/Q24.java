import java.util.Scanner;

class Q24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        switch(marks/10) {
            case 10: case 9: case 8: System.out.println("Grade: A"); break;
            case 7: System.out.println("Grade: B"); break;
            case 6: System.out.println("Grade: C"); break;
            case 5: System.out.println("Grade: D"); break;
            case 4: System.out.println("Grade: E"); break;
            default: System.out.println("Grade: F");
        }
    }
}

/* Output:
Enter marks: 
78
Grade: B
*/
