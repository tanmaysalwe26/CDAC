import java.util.Scanner;

class marksValidation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int marks=sc.nextInt();
		try{
			if(marks>=0&&marks<=10){
				System.out.println("Marks are within range");
			}
			else{
				throw new Exception("Invalid marks");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}