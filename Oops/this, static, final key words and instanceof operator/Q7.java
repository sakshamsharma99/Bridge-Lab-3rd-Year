class Teacher {
    static String schoolName = "Sunrise School";
    static int totalTeachers = 0;
    final int empId;
    String name;
    String subject;

    Teacher(int empId, String name, String subject) {
        this.empId = empId;
        this.name = name;
        this.subject = subject;
        totalTeachers++;
    }

    static void displayTotalTeachers() {
        System.out.println("Total Teachers: " + totalTeachers);
    }

    void displayTeacher() {
        if (this instanceof Teacher) {
            System.out.println("ID: " + empId + ", Name: " + name + ", Subject: " + subject);
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "Meena", "Math");
        Teacher t2 = new Teacher(2, "Raj", "Science");
        Teacher.displayTotalTeachers();
        t1.displayTeacher();
        t2.displayTeacher();
    }
}