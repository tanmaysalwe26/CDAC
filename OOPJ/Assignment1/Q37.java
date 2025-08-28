import java.util.Scanner;

class Q37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not Leap Year";
        System.out.println(result);
    }
}

/* Output:
Enter year: 
2024
Leap Year
*/
