import java.util.Scanner;

class Q4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		float length = sc.nextFloat();
		System.out.print("Enter breadth: ");
		float breadth = sc.nextFloat();
		
		if(length==breadth){
			System.out.println("Square garden");
		}
		else{
			System.out.println("Rectangle");
		}
		sc.close();
	}
}

/* Output:
D:\CDAC\Java\Module>java Q4
Enter breadth: 8
Enter length: 55
Rectangle */