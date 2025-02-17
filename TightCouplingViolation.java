public class TightCouplingViolation {
    public static void main(String[] args) {
        Engine engine = new GasEngine();
        Car car = new Car(engine);
        car.start();
    }
}

interface Engine {
    void start();
}

class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gas engine started");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}

class HybridEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Hybrid engine started");
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car is running");
    }
}