import java.util.Scanner;

class EmployeeData{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int sal[]={60000,40000};
		System.out.print("Enter the array index: ");
		int i = sc.nextInt();
		System.out.print("Enter Working Hours: ");
		int workingHours = sc.nextInt();
		
		try{
			int salary = sal[i];
			try{
				int hrWage = salary/workingHours;
				System.out.println(hrWage);
			}catch(ArithmeticException e){
				System.out.println("Division by zero");
			}
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("Invalid Index");
		}
	}
}