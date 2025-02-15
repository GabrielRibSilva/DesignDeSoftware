public class DependencyInversionViolation {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        bulb.turnOn();
    }
}

class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}
