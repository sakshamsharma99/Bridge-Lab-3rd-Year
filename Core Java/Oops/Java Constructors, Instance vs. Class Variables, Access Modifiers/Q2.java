class Q2 {
    private double radius;

    public Q2() {
        this(1.0);
    }

    public Q2(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Circle radius: " + radius);
    }

    public static void main(String[] args) {
        Q2 c1 = new Q2();
        Q2 c2 = new Q2(5.5);
        c1.display();
        c2.display();
    }
}
