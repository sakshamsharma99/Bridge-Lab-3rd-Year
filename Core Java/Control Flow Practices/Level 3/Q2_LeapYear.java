
public class Q2_LeapYear {
    public static void main(String[] args) {
        int year = 2024; // you can change or take input

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}
