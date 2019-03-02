
public abstract class AirVehicle implements Vehicle {

    double maxSpeed;
    String firm;

    public AirVehicle(double maxSpeed, String firm) {
        this.maxSpeed = maxSpeed;
        this.firm = firm;
    }

    public AirVehicle() {
    }

    abstract void goFly();

    @Override
    public void goRide() {
        System.out.println("Я лечу!");
    }
}
