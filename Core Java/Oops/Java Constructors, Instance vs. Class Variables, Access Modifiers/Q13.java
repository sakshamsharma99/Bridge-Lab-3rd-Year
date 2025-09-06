class Q13 {
    public int employeeID;
    protected String department;
    private double salary;

    public Q13(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 50000);
        m.displayDetails();
        m.setSalary(60000);
        m.displayDetails();
    }
}

class Manager extends Q13 {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary());
    }
}
