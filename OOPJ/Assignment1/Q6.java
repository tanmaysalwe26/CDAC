import java.util.Scanner;
	
class Q6{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
			int marks = sc.nextInt();

		
			if (marks>=35){
				System.out.println("Student has passed");
			}
			else{
				System.out.println("Student has failed");
			}
	}
}

/* Output:
D:\CDAC\Java\Module>java Q6
Enter marks:
42
Student has passed */