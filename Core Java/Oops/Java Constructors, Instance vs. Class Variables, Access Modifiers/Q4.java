class Q4 {
    private String guestName;
    private String roomType;
    private int nights;

    public Q4() {
        this("Guest", "Standard", 1);
    }

    public Q4(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public Q4(Q4 other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println(guestName + " booked a " + roomType + " room for " + nights + " nights.");
    }

    public static void main(String[] args) {
        Q4 b1 = new Q4();
        Q4 b2 = new Q4("Poonam", "Deluxe", 3);
        Q4 b3 = new Q4(b2);
        b1.display();
        b2.display();
        b3.display();
    }
}
