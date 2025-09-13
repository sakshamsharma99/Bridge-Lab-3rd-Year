import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void getPatientDetails() { System.out.println(name + ", Age: " + age); }
    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double dailyRate;
    private int days;
    public InPatient(int id, String name, int age, int days, double dailyRate) {
        super(id, name, age);
        this.days = days;
        this.dailyRate = dailyRate;
    }
    public double calculateBill() { return days * dailyRate; }
    public void addRecord(String record) { records.add(record); }
    public List<String> viewRecords() { return records; }
}

class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double consultationFee;
    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }
    public double calculateBill() { return consultationFee; }
    public void addRecord(String record) { records.add(record); }
    public List<String> viewRecords() { return records; }
}

public class Q7 {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(101, "Alice", 30, 5, 2000));
        patients.add(new OutPatient(102, "Bob", 25, 500));
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }
    }
}
