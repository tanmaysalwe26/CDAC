import java.util.Scanner;

class salaryStorage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		double sal = sc.nextDouble();
		Double obj = Double.valueOf(sal);
		
		System.out.println("Double object: "+obj);
	}
}