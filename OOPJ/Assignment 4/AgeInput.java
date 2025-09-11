import java.util.*;

class AgeInput{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	
	try{
		String age = sc.nextLine();
		int number = Integer.parseInt(age);
		//age=Integer.parseInt(myString);
	}catch(NumberFormatException e){
		System.out.println("Invalid number format.");
	}
	}
}