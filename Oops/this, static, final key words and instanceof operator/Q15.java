class Hospital {
    static int totalHospitals = 0;
    final int regNo;
    String name;
    String city;

    Hospital(int regNo, String name, String city) {
        this.regNo = regNo;
        this.name = name;
        this.city = city;
        totalHospitals++;
    }

    static void displayTotalHospitals() {
        System.out.println("Total Hospitals: " + totalHospitals);
    }

    void displayHospital() {
        if (this instanceof Hospital) {
            System.out.println("Reg: " + regNo + ", Name: " + name + ", City: " + city);
        }
    }
}

public class Q15 {
    public static void main(String[] args) {
        Hospital h1 = new Hospital(101, "AIIMS", "Delhi");
        Hospital h2 = new Hospital(102, "Fortis", "Mumbai");
        Hospital.displayTotalHospitals();
        h1.displayHospital();
        h2.displayHospital();
    }
}
