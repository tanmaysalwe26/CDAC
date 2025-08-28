import java.util.Scanner;

class Q48 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 85){ 
		System.out.println("Grade: A");
		}
        else if (marks >= 75){
			System.out.println("Grade: A-");
		}
        else if (marks >= 65){
			System.out.println("Grade: B+");
		}
        else if (marks >= 55){
			System.out.println("Grade: B");
		}
        else if (marks >= 35){
			System.out.println("Grade: C");
		}
        else System.out.println("Fail");
    }
}

/* Output:
Enter marks: 
78
Grade: A-
*/
