class Hotel {
    static int totalHotels = 0;
    final int hotelId;
    String name;
    String city;

    Hotel(int hotelId, String name, String city) {
        this.hotelId = hotelId;
        this.name = name;
        this.city = city;
        totalHotels++;
    }

    static void displayTotalHotels() {
        System.out.println("Total Hotels: " + totalHotels);
    }

    void displayHotel() {
        if (this instanceof Hotel) {
            System.out.println("ID: " + hotelId + ", Name: " + name + ", City: " + city);
        }
    }
}

public class Q20 {
    public static void main(String[] args) {
        Hotel h1 = new Hotel(1, "Taj", "Mumbai");
        Hotel h2 = new Hotel(2, "Oberoi", "Delhi");
        Hotel.displayTotalHotels();
        h1.displayHotel();
        h2.displayHotel();
    }
}
