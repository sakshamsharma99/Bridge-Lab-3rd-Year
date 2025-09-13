class Student {
    static String universityName = "XYZ University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String course;

    Student(int rollNumber, String name, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent() {
        if (this instanceof Student) {
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Course: " + course);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", "CSE");
        Student s2 = new Student(102, "Alice", "ECE");
        Student.displayTotalStudents();
        s1.displayStudent();
        s2.displayStudent();
    }
}
