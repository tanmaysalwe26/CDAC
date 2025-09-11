import java.util.Scanner;

class eCommerce{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount as string: ");
		String str = sc.nextLine();
		
		int amt = Integer.parseInt(str);
		System.out.println("Additional amount to add: ");
		int add = sc.nextInt();
		System.out.println(amt+add);
	}
}