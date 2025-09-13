class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order " + orderId + " delivered on " + deliveryDate);
    }
}

public class Q6 {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "01-09-2025", "TRK123", "05-09-2025");
        d.getOrderStatus();
    }
}
