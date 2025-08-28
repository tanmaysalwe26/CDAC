import java.util.Scanner;

class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage marks: ");
        float percent = sc.nextFloat();

        if (percent >= 90) 
            System.out.println("Grade: A+");
        else if (percent >= 76) 
            System.out.println("Grade: A");
        else if (percent >= 66) 
            System.out.println("Grade: B+");
        else if (percent >= 51) 
            System.out.println("Grade: B");
        else if (percent >= 36) 
            System.out.println("Grade: C");
        else 
            System.out.println("Fail");
    }
}

/* Output:
Enter percentage marks: 
82
Grade: A
*/
