import java.util.Scanner;

class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the scores of first test: ");
		int t1 = sc.nextInt();
		System.out.print("Enter the scores of second test: ");
		int t2 = sc.nextInt();
		
		if (t1>t2){
			System.out.println("Test 1 has higher score.");
		}
		else{
			System.out.println("Test 2 has higher score.");
		}
	}
}

/* OUTPUT
D:\CDAC\Java\Module>java Q1
Enter the scores of first test: 88
Enter the scores of second test: 2
Test 1 has higher score.*/