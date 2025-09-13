import java.util.*;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }
    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
    public double calculateSalary() { return getBaseSalary() + bonus; }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hoursWorked) { this.hoursWorked = hoursWorked; }
    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }
    public double calculateSalary() { return hoursWorked * hourlyRate; }
}

public class Q1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(101, "Alice", 50000, 10000));
        employees.add(new PartTimeEmployee(102, "Bob", 0, 120, 200));
        employees.add(new FullTimeEmployee(103, "Charlie", 60000, 15000));
        employees.add(new PartTimeEmployee(104, "David", 0, 80, 250));
        for (Employee emp : employees) {
            System.out.println("================================");
            emp.displayDetails();
        }
    }
}
