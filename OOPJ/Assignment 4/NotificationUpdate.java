import java.util.Scanner;

class NotificationUpdate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Exam postponed");
		
		System.out.println("Original text: "+sb);
		
		System.out.print("Text to find: ");
		String find = sc.nextLine();
		
		System.out.print("Replacement Text: ");
		String rep = sc.nextLine();
		
		int start = sb.indexOf(find);
		int end = start + find.length();
		
		sb.replace(start,end,rep);
		System.out.println(sb);
	}
}