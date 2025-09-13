abstract class Base {
    private String data;

    Base(String data) {
        this.data = data;
    }

    final void showData() {
        System.out.println(data);
    }

    abstract void process();
}

class Sub extends Base {
    Sub(String data) {
        super(data);
    }

    @Override
    void process() {
        System.out.println("Processing...");
    }
}

public class Q12 {
    public static void main(String[] args) {
        Base b = new Sub("Hello");
        b.showData();
        b.process();
    }
}
