import java.util.Scanner;

class ExamScores{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n = sc.nextInt();
        int[] scores = new int[n];
		
		System.out.print("Enter "+n+"array elements: ");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
		
		System.out.print("Entered Elements: [ ");
		for (int i = 0; i < n; i++) {
            System.out.print(+scores[i]+ " ");
        }System.out.print("]");
		
		System.out.println();
		System.out.print("Entered the element you want to access: ");
		int index = sc.nextInt();

        try {
            System.out.println(scores[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index exception");
        }

	}
}