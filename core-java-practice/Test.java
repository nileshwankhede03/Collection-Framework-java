// IS-A (Inheritance)
class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

class Car extends Vehicle // important
{   // Car IS-A Vehicle
    void fuel() {
        System.out.println("Car uses petrol/diesel");
    }
}

// HAS-A (Association)
class Engine 
{
    void start() {
        System.out.println("Engine starting...");
    }
}
// Note : make obj in anoter class & in contructor call super class method
// dont inherit in a HAS - A Relationship
class Bike // important
{
    Engine engine = new Engine();  // Bike HAS-A Engine

    void ride() {
        engine.start();
        System.out.println("Bike is riding...");
    }
}

public class Test 
{
    public static void main(String[] args) {
        Car c = new Car();   // IS-A relation
        c.run();
        c.fuel();

        Bike b = new Bike(); // HAS-A relation
        b.ride();
    }
}
