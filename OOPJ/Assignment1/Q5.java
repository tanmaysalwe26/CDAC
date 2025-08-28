import java.util.Scanner;
	
class Q5{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
			int year = sc.nextInt();

		
			if ((year%4==0 && year%100!=0) || (year % 400==0)){
				System.out.println("Year " + year + " is leap year");
			}
			else{
				System.out.println("Year " + year + " is not leap year");
			}
	}
}

/* Output:
D:\CDAC\Java\Module>java Q5
Enter the year:
2024
Year 2024 is leap year */