import java.util.Scanner;

class Q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary for Company 1: ");
		int sal1 = sc.nextInt();
		System.out.print("Enter salary for Company 2: ");
		int sal2 = sc.nextInt();
		System.out.print("Enter salary for Company 3: ");
		int sal3 = sc.nextInt();
		
		if(sal1>sal2 && sal1>sal3){
			System.out.println("Company 1 offers the highest salary.");
		}
		else if(sal2>sal1 && sal2>sal3){
			System.out.println("Company 2 offers the highest salary.");
		}
		else{
			System.out.println("Company 3 offers the highest salary.");
		}
	}
}

/*Output:
D:\CDAC\Java\Module>java Q2
Enter salary for Company 1: 90000
Enter salary for Company 2: 70000
Enter salary for Company 3: 120000
Company 3 offers the highest salary.*/