class AutoEmployee {
    int id;
    String name;
    double basicSalary;
    static int counter = 1001;

    AutoEmployee() {
        this.name = "Unknown";
        this.basicSalary = 20000;
        this.id = counter++;
    }

    AutoEmployee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.id = counter++;
    }

    void display() {
        System.out.println("ID=" + id + ", Name=" + name + ", Salary=" + basicSalary);
    }
}

class Q15EmployeeAutoID {
    public static void main(String[] args) {
        AutoEmployee e1 = new AutoEmployee();
        AutoEmployee e2 = new AutoEmployee("Ravi", 30000);

        e1.display();
        e2.display();
    }
}

/*Output
ID=1001, Name=Unknown, Salary=20000.0
ID=1002, Name=Ravi, Salary=30000.0
*/
