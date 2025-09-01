class VehiclePortal {
    String regNo;
    String ownerName;
    String vehicleType;
    static int count = 1;

    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    VehiclePortal(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + count++;
    }

    void display() {
        System.out.println("RegNo=" + regNo + ", Owner=" + ownerName + ", Type=" + vehicleType);
    }
}

class Q19VehiclePortal {
    public static void main(String[] args) {
        VehiclePortal v1 = new VehiclePortal("Ravi", "Car");
        VehiclePortal v2 = new VehiclePortal("Anita", "Bike");

        v1.display();
        v2.display();
    }
}

/*Output
Welcome to CDAC Vehicle Registration Portal
RegNo=MH-2025-1, Owner=Ravi, Type=Car
RegNo=MH-2025-2, Owner=Anita, Type=Bike
*/
