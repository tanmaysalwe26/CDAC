import java.util.Scanner;

class Employee{
	private int age;
	
	void setAge(int age){
		if(age>18){
			this.age=age;
		}
		else{
			System.out.println("Invalid age: ");
			this.age=age;
		}
	}
	
	int getAge(){
		return this.age;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		int num = sc.nextInt();
		e1.setAge(num);
		e1.getAge();
		System.out.println("Age: "+e1.getAge());
	}
}