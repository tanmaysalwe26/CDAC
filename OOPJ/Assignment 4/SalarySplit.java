import java.util.Scanner;

class SalarySplit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bonus to divide: ");
		int bonus = sc.nextInt();
		System.out.print("Enter the number of employees: ");
		int empNum = sc.nextInt();
		System.out.println(divide(empNum,bonus));
		
	}
	
	static double divide(int empNum, int bonus){
		int div=1;
		try{
			div=bonus/empNum;
		}catch(ArithmeticException e){
			System.out.println("Error: Division by zero not allowed ");
		}
		return div;
	}
}
