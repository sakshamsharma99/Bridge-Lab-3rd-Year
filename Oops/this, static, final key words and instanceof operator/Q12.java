class City {
    static String country = "India";
    final int cityCode;
    String name;
    int population;

    City(int cityCode, String name, int population) {
        this.cityCode = cityCode;
        this.name = name;
        this.population = population;
    }

    static void changeCountry(String newCountry) {
        country = newCountry;
    }

    void displayCity() {
        if (this instanceof City) {
            System.out.println("Code: " + cityCode + ", Name: " + name + ", Population: " + population + ", Country: " + country);
        }
    }
}

public class Q12 {
    public static void main(String[] args) {
        City c1 = new City(101, "Delhi", 19000000);
        City c2 = new City(102, "Mumbai", 20000000);
        c1.displayCity();
        c2.displayCity();
        City.changeCountry("Bharat");
        c1.displayCity();
        c2.displayCity();
    }
}
