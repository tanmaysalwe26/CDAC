class Passenger {
    String name;
    int age;
    String seatType;
    static int totalPassengers = 0;

    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General";
        totalPassengers++;
    }

    Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengers++;
    }

    static void showTotalPassengers() {
        System.out.println("Total Passengers Booked: " + totalPassengers);
    }
}

class Q6RailwayBooking{
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        System.out.println("Passenger1: Name: " + p1.name + ", Age: " + p1.age + ", Seat: " + p1.seatType);
        System.out.println("Passenger2: Name: " + p2.name + ", Age: " + p2.age + ", Seat: " + p2.seatType);
        System.out.println("Passenger3: Name: " + p3.name + ", Age: " + p3.age + ", Seat: " + p3.seatType);

        Passenger.showTotalPassengers();
    }
}

/*Output
Passenger1: Name: Ravi, Age: 25, Seat: General
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, Seat: General
Total Passengers Booked: 3
*/
