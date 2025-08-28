import java.util.Scanner;

class Q47 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Both are even");
		}
        else if (num1 % 2 != 0 && num2 % 2 != 0){
			System.out.println("Both are odd");
		}
        else{
            System.out.println("Numbers are mixed (one even, one odd)");
		}
	}
}

/* Output:
Enter first number: 
12
Enter second number: 
17
Numbers are mixed (one even, one odd)
*/
