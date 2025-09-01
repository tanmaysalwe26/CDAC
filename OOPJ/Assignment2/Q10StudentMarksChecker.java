class MarksStudent {
    int rollNo;
    String name;
    int marks;

    MarksStudent(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("RollNo=" + rollNo + ", Name=" + name + ", Marks=" + marks);
    }
}

class Q10StudentMarksChecker{
    public static void main(String[] args) {
        MarksStudent s = new MarksStudent(1, "Rahul", 70);
        s.setMarks(85);
        s.display();
    }
}

/*Output
RollNo=1, Name=Rahul, Marks=85
*/
