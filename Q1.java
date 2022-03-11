
interface IVehicle {
    void maxVehicleSpeed();
}

interface ICar extends IVehicle {
    void tellNoOfWheels();
}

interface IBoat extends IVehicle {
    boolean haveBoatPaddles();
}

interface IAmphicar extends ICar, IBoat {

}

class Car implements ICar {

    @Override
    public void maxVehicleSpeed() {
        System.out.println("Telling Car Maximum Speed...");

    }

    @Override
    public void tellNoOfWheels() {
        System.out.println("Car have atleast 4 Wheels...");
    }

}

class Boat implements IBoat {

    @Override
    public void maxVehicleSpeed() {
        System.out.println("Telling Boat Max Speed...");
    }

    @Override
    public boolean haveBoatPaddles() {
        System.out.println("is there any Paddles for boat?");
        return false;
    }

}

class Amphicar implements ICar, IBoat {

    @Override
    public void maxVehicleSpeed() {
        System.out.println("AmphiCar Max Speed ");
    }

    @Override
    public boolean haveBoatPaddles() {
        System.out.println("AmphiCar have Boat Paddles!");
        return false;
    }

    @Override
    public void tellNoOfWheels() {
        System.out.println("AmphiCar Number of wheels!");
    }

}

class Q1 {

    public static void main(String arg[]) {
        Car c = new Car();
        Boat b = new Boat();
        Amphicar a = new Amphicar();

        System.out.println("Car:");
        c.maxVehicleSpeed();
        c.tellNoOfWheels();

        System.out.println("\nBoat:");
        b.maxVehicleSpeed();
        b.haveBoatPaddles();

        System.out.println("\nAmphicar:");
        a.maxVehicleSpeed();
        a.tellNoOfWheels();
        a.haveBoatPaddles();
    }

}

// java do not support multiple inheritance. Amphicar can not
// inherit concreate/ abstract class of Car and Boat at the
// same time. So the solution is to use interface for Car
// and Boat, as any class can implement multiple interfaces.