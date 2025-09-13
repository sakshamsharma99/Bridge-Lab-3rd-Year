class Restaurant {
    static int totalRestaurants = 0;
    final int regId;
    String name;
    String cuisine;

    Restaurant(int regId, String name, String cuisine) {
        this.regId = regId;
        this.name = name;
        this.cuisine = cuisine;
        totalRestaurants++;
    }

    static void displayTotalRestaurants() {
        System.out.println("Total Restaurants: " + totalRestaurants);
    }

    void displayRestaurant() {
        if (this instanceof Restaurant) {
            System.out.println("Reg: " + regId + ", Name: " + name + ", Cuisine: " + cuisine);
        }
    }
}

public class Q17 {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant(1, "Spicy House", "Indian");
        Restaurant r2 = new Restaurant(2, "Pasta Point", "Italian");
        Restaurant.displayTotalRestaurants();
        r1.displayRestaurant();
        r2.displayRestaurant();
    }
}
