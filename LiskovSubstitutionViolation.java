public class LiskovSubstitutionViolation {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        NonFlyingBird ostrich = new Ostrich();
        ostrich.walk();
    }
}

abstract class Bird {
    public abstract void makeSound();
}

interface FlyingBird {
    void fly();
}

interface NonFlyingBird {
    void walk();
}

class Sparrow extends Bird implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow chirps");
    }
}

class Ostrich extends Bird implements NonFlyingBird {
    @Override
    public void walk() {
        System.out.println("Ostrich is walking");
    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich booms");
    }
}