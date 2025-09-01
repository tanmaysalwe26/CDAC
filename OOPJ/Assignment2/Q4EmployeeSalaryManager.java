class Employee {
    String name;
    double salary;
    int yearsOfService;
    static int totalEmployees = 0;

    Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++;
    }

    double calculateBonus() {
        if (yearsOfService > 5) return salary * 0.05;
        return 0.0;
    }

    static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
}

class Q4EmployeeSalaryManager{
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 150000, 6);
        Employee e2 = new Employee("Anita", 120000, 3);
        Employee e3 = new Employee("Suresh", 100000, 5);

        System.out.println("Employee Ravi Bonus: " + e1.calculateBonus());
        System.out.println("Employee Anita Bonus: " + e2.calculateBonus());
        System.out.println("Employee Suresh Bonus: " + e3.calculateBonus());

        Employee.showTotalEmployees();
    }
}

/*Output
Employee Ravi Bonus: 7500.0
Employee Anita Bonus: 0.0
Employee Suresh Bonus: 0.0
Total employees: 3
*/
