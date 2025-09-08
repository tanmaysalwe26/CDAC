import java.util.Scanner;

class Book{
	private int copiesAvailable;
	
	void setCopiesAvailable(int n){
		this.copiesAvailable = n;
	}
	
	void addCopies(int num){
		this.copiesAvailable+=num;
	}
	
	void removeCopies(int num){
		if(this.copiesAvailable>num){
		this.copiesAvailable-=num;
		}
		else{
			System.out.println("Not enough books available.");
		}
	}
	
	int getCopiesAvailable(){
		return this.copiesAvailable;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		System.out.print("How many books do you want to add? ");
		int add = sc.nextInt();
		b1.addCopies(add);
		System.out.print("How many books do you want to remove? ");
		int subs = sc.nextInt();
		b1.removeCopies(subs);
		
		System.out.println("Copies available = "+b1.getCopiesAvailable());
	}
}