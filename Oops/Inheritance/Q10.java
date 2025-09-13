interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Cooking food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Serving food");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Worker c = new Chef("Raj", 1);
        Worker w = new Waiter("Kiran", 2);
        c.performDuties();
        w.performDuties();
    }
}
