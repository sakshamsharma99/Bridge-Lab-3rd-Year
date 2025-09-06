class Q3 {
    private String name;
    private int age;

    public Q3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Q3(Q3 other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Q3 p1 = new Q3("Saksham", 21);
        Q3 p2 = new Q3(p1);
        p1.display();
        p2.display();
    }
}
