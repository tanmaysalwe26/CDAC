class SchoolStudent {
    String name;
    String className;
    static int tuitionFee;

    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    SchoolStudent(String name, String className) {
        this.name = name;
        this.className = className;
    }

    void display() {
        System.out.println("Student: Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }
}

class Q9SchoolFeeSystem{
    public static void main(String[] args) {
        SchoolStudent s1 = new SchoolStudent("Anjali", "10th");
        SchoolStudent s2 = new SchoolStudent("Vikram", "12th");

        s1.display();
        s2.display();
    }
}

/*Output
School Tuition Fee Initialized: 30000
Student: Name=Anjali, Class=10th, Tuition Fee=30000
Student: Name=Vikram, Class=12th, Tuition Fee=30000
*/
