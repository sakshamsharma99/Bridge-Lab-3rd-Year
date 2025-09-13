class Course {
    static int totalCourses = 0;
    final int courseId;
    String name;
    String instructor;

    Course(int courseId, String name, String instructor) {
        this.courseId = courseId;
        this.name = name;
        this.instructor = instructor;
        totalCourses++;
    }

    static void displayTotalCourses() {
        System.out.println("Total Courses: " + totalCourses);
    }

    void displayCourse() {
        if (this instanceof Course) {
            System.out.println("ID: " + courseId + ", Name: " + name + ", Instructor: " + instructor);
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Course c1 = new Course(11, "Java", "Mr. Sharma");
        Course c2 = new Course(12, "Python", "Ms. Verma");
        Course.displayTotalCourses();
        c1.displayCourse();
        c2.displayCourse();
    }
}
