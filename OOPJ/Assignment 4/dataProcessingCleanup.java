import java.util.Scanner;

class  dataProcessingCleanup{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			
		try{
			int i = sc.nextInt();
		}catch(Exception e){
			System.out.println("Exception Occured: Invalid input");
		}
		finally{
			System.out.println("Data Processing completed");
		}
	}
} 