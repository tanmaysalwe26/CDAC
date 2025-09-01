class Customer {
    String name;
    String ticketType;
    static int totalTickets = 0;

    Customer(String name) {
        this.name = name;
        this.ticketType = "Normal";
        totalTickets++;
    }

    Customer(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalTickets++;
    }

    static void showTotalTickets() {
        System.out.println("Total Tickets Sold: " + totalTickets);
    }
}

class Q7MovieBooking{
    public static void main(String[] args) {
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amit");

        System.out.println("Customer1: Name: " + c1.name + ", Ticket: " + c1.ticketType);
        System.out.println("Customer2: Name: " + c2.name + ", Ticket: " + c2.ticketType);
        System.out.println("Customer3: Name: " + c3.name + ", Ticket: " + c3.ticketType);

        Customer.showTotalTickets();
    }
}

/*Output
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Amit, Ticket: Normal
Total Tickets Sold: 3
*/
