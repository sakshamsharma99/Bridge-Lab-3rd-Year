// Q6: StudentsGrades
public class Q6 {
    String name;
    String rollNumber;
    double[] marks;

    Q6(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade(double[] marks) {
        double totalMarks = calculateTotalMarks(marks);
        if (totalMarks >= 80 && totalMarks <= 100) return "Grade A";
        else if (totalMarks >= 60) return "Grade B";
        else if (totalMarks >= 50) return "Grade C";
        else if (totalMarks >= 40) return "Grade D";
        else return "Grade F";
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark" + (i + 1) + ": " + marks[i]);
        }
        System.out.println(calculateGrade(marks));
    }

    public double calculateTotalMarks(double[] marks) {
        double sum = 0;
        for (double m : marks) sum += m;
        return sum / 3;
    }

    public static void main(String[] args) {
        double[] mark1 = {80, 70, 75};
        double[] mark2 = {60, 65, 50};
        Q6 student1 = new Q6("Thamarai", "ECE001", mark1);
        Q6 student2 = new Q6("Kannan", "CSC002", mark2);
        student1.displayStudent();
        student2.displayStudent();
    }
}
