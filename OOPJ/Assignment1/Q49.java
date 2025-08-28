import java.util.Scanner;

class Q49 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter month number: ");
        int month = sc.nextInt();
		int days=0;

        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			days = 31; 
			break;
			
            case 4: case 6: case 9: case 11: 
			days = 30; 
			break;
			
            case 2:
			days = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28; 
			break;
            default:
				System.out.println("Invalid month");
        }

        System.out.println(days + " days");
    }
}

/* Output:
Enter year: 
2024
Enter month number: 
2
29 days
*/
