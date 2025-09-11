import java.util.Scanner;

class  ticketNumberVerification{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ticket number: ");
		String tickNum = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.insert(0,tickNum);
		System.out.print("Verification code: ");
		System.out.println(sb.reverse());
	}
}