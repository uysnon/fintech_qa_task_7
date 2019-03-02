public abstract class GroundVehicle implements Vehicle {
    protected static int numWheels;
    protected double radiusWheel;
    protected int maxPassengers;
    protected double weight;
    protected String firm;
    protected double maxSpeed;

    public static void setNumWheels(int numWheels) {
        GroundVehicle.numWheels = numWheels;
    }

    public void setRadiusWheel(double radiusWheel) {
        this.radiusWheel = radiusWheel;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static int getNumWheels() {
        return numWheels;
    }

    public double getRadiusWheel() {
        return radiusWheel;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getWeight() {
        return weight;
    }

    public String getFirm() {
        return firm;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public GroundVehicle() {
    }

    public GroundVehicle(double radiusWheel, int maxPassengers, double weight, String firm, double maxSpeed) {
        this.radiusWheel = radiusWheel;
        this.maxPassengers = maxPassengers;
        this.weight = weight;
        this.firm = firm;
        this.maxSpeed = maxSpeed;
    }

    double diameterWheel(){
        return this.radiusWheel *2;
    }
}
