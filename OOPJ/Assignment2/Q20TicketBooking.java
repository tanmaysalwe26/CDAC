class Ticket {
    String passengerName;
    int ticketNo;
    static int counter = 5001;

    Ticket(String passengerName) {
        this.passengerName = passengerName;
        this.ticketNo = counter++;
    }

    void displayTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }
}

class Q20TicketBooking {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Rahul");
        Ticket t2 = new Ticket("Priya");
        Ticket t3 = new Ticket("Amit");

        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();
    }
}

/*Output
Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passenger: Amit
*/
