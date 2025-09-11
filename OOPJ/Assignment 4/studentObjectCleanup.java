class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Student object for " + this.name + " is being garbage collected.");
        } finally {
            super.finalize();
        }
    }
}

public class studentObjectCleanup {
    public static void main(String[] args) {
        System.out.println("Student Name: Amit");
        
        Student s1 = new Student("Amit");

        s1 = null; 

        System.gc();
    }
}