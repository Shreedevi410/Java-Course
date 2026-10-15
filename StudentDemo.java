class Student {
    private String name;
    private int rollNo;
    private double marks;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Aisha", 101, 85.5);
        student.displayStudent();

        student.setMarks(90.0);
        System.out.println("\nAfter updating marks:");
        student.displayStudent();
    }
}
