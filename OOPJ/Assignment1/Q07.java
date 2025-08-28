import java.util.Scanner;

class Q07{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		
		if(marks >=35){
			System.out.println("Student has passed");
		}
		else{
			System.out.println("Student has failed");
		}
	}
}

/* Output:
D:\CDAC\Java\Module>java Q07.java
Enter marks:
88
Student has passed
*/