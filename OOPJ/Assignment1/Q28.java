import java.util.Scanner;

class Q28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter traffic light color: ");
        String color = sc.next();

        switch (color.toLowerCase()) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Wait"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid color");
        }
    }
}

/* Output:
Enter traffic light color: 
Green
Go
*/
