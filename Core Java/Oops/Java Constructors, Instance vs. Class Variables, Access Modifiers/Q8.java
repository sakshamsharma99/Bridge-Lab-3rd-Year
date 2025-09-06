class Q8 {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "ABC Institute";

    public Q8(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName + " | Duration: " + duration + " months | Fee: " + fee +
                " | Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Q8 c1 = new Q8("Java", 6, 12000);
        Q8 c2 = new Q8("Python", 4, 10000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Q8.updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
