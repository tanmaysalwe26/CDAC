import java.util.Scanner;

class TemperatureSensor{
	private int temperature;
	
	void setTemperature(int t){
		if(t>0 && t<100){
			this.temperature = t;
		}
		else{
			System.out.println("Temperature is out of range 0-100 degree C");
		}
	}
	
	int getTemperature(){
		return this.temperature;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		TemperatureSensor t1 = new TemperatureSensor();
		System.out.print("Enter the temperature: ");
		int temp = sc.nextInt();
		t1.setTemperature(temp);
		System.out.println("Temperature = "+t1.getTemperature());
	}
}