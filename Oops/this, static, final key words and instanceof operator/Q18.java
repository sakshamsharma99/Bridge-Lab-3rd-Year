class College {
    static int totalColleges = 0;
    final int code;
    String name;
    String city;

    College(int code, String name, String city) {
        this.code = code;
        this.name = name;
        this.city = city;
        totalColleges++;
    }

    static void displayTotalColleges() {
        System.out.println("Total Colleges: " + totalColleges);
    }

    void displayCollege() {
        if (this instanceof College) {
            System.out.println("Code: " + code + ", Name: " + name + ", City: " + city);
        }
    }
}

public class Q18 {
    public static void main(String[] args) {
        College c1 = new College(101, "IIT Delhi", "Delhi");
        College c2 = new College(102, "IIT Bombay", "Mumbai");
        College.displayTotalColleges();
        c1.displayCollege();
        c2.displayCollege();
    }
}
