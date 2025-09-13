class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    final int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployee() {
        if (this instanceof Employee) {
            System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department);
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "IT");
        Employee e2 = new Employee(2, "Alice", "HR");
        Employee.displayTotalEmployees();
        e1.displayEmployee();
        e2.displayEmployee();
    }
}
