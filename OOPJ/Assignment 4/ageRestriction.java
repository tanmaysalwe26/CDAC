import java.util.Scanner;

class ageCheckException extends Exception{
	public ageCheckException(String m){
		super(m);
	}
}

public class ageRestriction{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		try{
			if(age<18){
				throw new ageCheckException("Age must be 18 or older to register");
			}else{
				System.out.println("Validation succesful");
			}
		}catch(ageCheckException e){
			System.out.println(e.getMessage());	
		}
	}
}