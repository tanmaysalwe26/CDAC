class GradeStudent {
    int rollNo;
    String name;
    int marks;

    GradeStudent(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }

    void display() {
        System.out.println("RollNo=" + rollNo + ", Name=" + name + ", Marks=" + marks + ", Grade=" + calculateGrade());
    }
}

class Q11StudentGrade{
    public static void main(String[] args) {
        GradeStudent s1 = new GradeStudent(1, "Rahul", 85);
        GradeStudent s2 = new GradeStudent(2, "Pooja", 55);

        s1.display();
        s2.display();
    }
}

/*Output
RollNo=1, Name=Rahul, Marks=85, Grade=A
RollNo=2, Name=Pooja, Marks=55, Grade=C
*/
