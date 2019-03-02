public abstract class Maritime implements Vehicle{
    double weight;
    double maxSpeed;
    String material;
    int maxPassengers;

    public Maritime() {
    }

    public Maritime(double weight, double maxSpeed, String material, int maxPassengers) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.material = material;
        this.maxPassengers = maxPassengers;
    }

    abstract void feelingsAfterCruise();

    @Override
    public void goRide() {
        System.out.println("волна раз, волна два-с");
    }
}
