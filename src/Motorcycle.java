public class Motorcycle extends GroundVehicle {

    double fuel;
    double maxFuel;

    public Motorcycle(double radiusWheel, int maxPassengers, double weight, String firm, double maxSpeed, double maxFuel) {
        super(radiusWheel, maxPassengers, weight, firm, maxSpeed);
        this.maxFuel = maxFuel;
    }

    public void goStunt(){
        System.out.println("I'm a stunter");
    }

    @Override
    public void goRide() {
        System.out.println("viiiiiu, i'm a biker");
    }
}
