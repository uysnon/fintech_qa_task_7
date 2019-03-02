public class Train extends  GroundVehicle{
    int numCarriages;
    boolean isPassenger;

    public Train(double radiusWheel, int maxPassengers, double weight, String firm, double maxSpeed, int numCarriages, boolean isPassenger) {
        super(radiusWheel, maxPassengers, weight, firm, maxSpeed);
        this.numCarriages = numCarriages;
        this.isPassenger = isPassenger;
    }

    @Override
    public void goRide() {
        System.out.println("vvvvv -  ya in the train !");
    }
}
