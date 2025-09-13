class Festival {
    static String country = "India";
    final int festId;
    String name;
    String month;

    Festival(int festId, String name, String month) {
        this.festId = festId;
        this.name = name;
        this.month = month;
    }

    static void changeCountry(String newCountry) {
        country = newCountry;
    }

    void displayFestival() {
        if (this instanceof Festival) {
            System.out.println("ID: " + festId + ", Name: " + name + ", Month: " + month + ", Country: " + country);
        }
    }
}

public class Q19 {
    public static void main(String[] args) {
        Festival f1 = new Festival(1, "Diwali", "November");
        Festival f2 = new Festival(2, "Holi", "March");
        f1.displayFestival();
        f2.displayFestival();
        Festival.changeCountry("Bharat");
        f1.displayFestival();
        f2.displayFestival();
    }
}
