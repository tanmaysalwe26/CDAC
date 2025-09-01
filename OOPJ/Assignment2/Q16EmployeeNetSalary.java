class NetEmployee {
    int id;
    String name;
    double basicSalary;
    static int counter = 2001;

    NetEmployee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.id = counter++;
    }

    double calculateNetSalary() {
        double hra = basicSalary * 0.10;
        double da = basicSalary * 0.05;
        double pf = basicSalary * 0.02;
        return basicSalary + hra + da - pf;
    }

    void display() {
        System.out.println("ID=" + id + ", Name=" + name + ", NetSalary=" + calculateNetSalary());
    }
}

class Q16EmployeeNetSalary {
    public static void main(String[] args) {
        NetEmployee e1 = new NetEmployee("Ravi", 30000);
        NetEmployee e2 = new NetEmployee("Anita", 40000);

        e1.display();
        e2.display();
    }
}

/*Output
ID=2001, Name=Ravi, NetSalary=33960.0
ID=2002, Name=Anita, NetSalary=45280.0
*/
