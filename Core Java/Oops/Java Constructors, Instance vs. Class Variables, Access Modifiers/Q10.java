class Q10 {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Q10(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Saksham", 9.2);
        pg.displayDetails();
        pg.setCGPA(9.5);
        pg.displayDetails();
    }
}

class PostgraduateStudent extends Q10 {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }
}
