import java.util.Scanner;

class orderNumberDisplay{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.print("Enter the strng: ");
		String insert = sc.nextLine();
		sb.append(insert);
		
		System.out.println(sb.reverse());
	}
}