import java.util.Scanner;

class Q16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input");
        } else if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}

/* Output:
Enter a character: 
e
Vowel
*/
