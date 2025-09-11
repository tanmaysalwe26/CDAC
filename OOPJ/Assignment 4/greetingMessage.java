import java.util.Scanner;

class greetingMessage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Initial Text: Hello");
		StringBuilder sb = new StringBuilder("Hello ");
		
		System.out.print("Text to insert: ");
		String Str =sc.nextLine();
		System.out.print("Insert Index: ");
		int i = sc.nextInt();
		sc.nextLine();
		sb=sb.insert(i,Str);
		
		System.out.print("Text to append: ");
		String app = sc.nextLine();
		sb.append(app);
		
		System.out.println(sb);
	}
}