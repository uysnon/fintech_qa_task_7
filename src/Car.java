public class Car extends GroundVehicle {

    double fuel;
    double maxFuel;

    public Car(double radiusWheel, int maxPassengers, double weight, String firm, double maxSpeed, double maxFuel) {
        super(radiusWheel, maxPassengers, weight, firm, maxSpeed);
        this.maxFuel = maxFuel;
        fuel = 0;
    }

    @Override
    public void goRide() {
        System.out.println("vrrrrrrrrrrrrr");
    }

    public void refuel(double litres){
        if (fuel + litres > maxFuel) {
            fuel = maxFuel;
            return;
        }
        fuel = fuel + litres;
    }

    boolean isEmptyTank(){
        if (fuel == 0){
            return true;
        }
        return false;
    }
}
