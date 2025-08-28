import java.util.Scanner;

class Q46 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch))
            System.out.println("Alphabet");
        else if (Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}

/* Output:
Enter character: 
%
Special Character
*/
