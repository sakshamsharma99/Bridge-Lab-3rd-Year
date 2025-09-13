class Airline {
    static String country = "India";
    final String code;
    String name;
    int fleetSize;

    Airline(String code, String name, int fleetSize) {
        this.code = code;
        this.name = name;
        this.fleetSize = fleetSize;
    }

    static void changeCountry(String newCountry) {
        country = newCountry;
    }

    void displayAirline() {
        if (this instanceof Airline) {
            System.out.println("Code: " + code + ", Name: " + name + ", Fleet: " + fleetSize + ", Country: " + country);
        }
    }
}

public class Q16 {
    public static void main(String[] args) {
        Airline a1 = new Airline("AI", "Air India", 150);
        Airline a2 = new Airline("6E", "IndiGo", 300);
        a1.displayAirline();
        a2.displayAirline();
        Airline.changeCountry("Bharat");
        a1.displayAirline();
        a2.displayAirline();
    }
}
