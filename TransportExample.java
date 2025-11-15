class Transport {
    void move() {
        System.out.println("Transport can move");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods");
    }
}

public class TransportExample {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.move();
        b.carryPassengers();

        System.out.println();

        Truck t = new Truck();
        t.move();
        t.carryGoods();
    }
}
