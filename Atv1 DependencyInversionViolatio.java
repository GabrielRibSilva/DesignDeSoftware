public class DependencyInversionSolution {
    public static void main(String[] args) {
        ILight bulb = new LightBulb(); 
        bulb.turnOn();
    }
}

interface ILight {
    void turnOn();
    void turnOff();
}

class LightBulb implements ILight {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}