import java.util.Scanner;

class Q22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int m = sc.nextInt();

        String res = (m==1)?"Month is January":
                     (m==2)?"Month is February":
                     (m==3)?"Month is March":
                     (m==4)?"Month is April":
                     (m==5)?"Month is May":
                     (m==6)?"Month is June":
                     (m==7)?"Month is July":
                     (m==8)?"Month is August":
                     (m==9)?"Month is September":
                     (m==10)?"Month is October":
                     (m==11)?"Month is November":
                     (m==12)?"Month is December":
                     "Invalid";
        System.out.println(res);
    }
}

/* Output:
Enter month number: 
8
Month is August
*/
