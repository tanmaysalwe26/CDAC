import java.util.Scanner;

class Student{
	private int marks;
	
	void setMarks(int marks){
		if(marks>0&&marks<100){
		this.marks= marks;
		}
		else{
		System.out.println("Please enter marks between 0-100");
		this.marks= marks;
		}
	}
	int getMarks(){
		return marks;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks = sc.nextInt();
		Student s1=new Student();
		s1.setMarks(marks);
		System.out.println("Marks = "+s1.getMarks());
	}
}