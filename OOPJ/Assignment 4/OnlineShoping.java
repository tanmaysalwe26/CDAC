import java.util.Scanner;

class OnlineShoping{

	static void orderProcessing(int i,int q,int price[]){
		try{
			int total=q*price[i];
			System.out.println(total);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception caught");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Exception");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int price[]={499,699,1714,7714};
		System.out.print("Enter the array index: ");
		int i = sc.nextInt();
		System.out.println();
		System.out.print("Enter the quantity: ");
		int q = sc.nextInt();
		orderProcessing(i,q,price);
	}
}