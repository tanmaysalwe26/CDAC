class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;
    static int vehicleCount = 1;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + vehicleCount++;
    }

    void display() {
        System.out.println("RegNo=" + regNo + ", Owner=" + ownerName + ", Type=" + vehicleType);
    }
}

class Q18VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Anita", "Bike");

        v1.display();
        v2.display();
    }
}

/*Output
RegNo=MH-2025-1, Owner=Ravi, Type=Car
RegNo=MH-2025-2, Owner=Anita, Type=Bike
*/
