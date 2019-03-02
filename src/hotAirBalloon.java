public class hotAirBalloon extends AirVehicle {
    private double maxHeight;
    private double timeFly;

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void setTimeFly(double timeFly) {
        this.timeFly = timeFly;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public double getTimeFly() {
        return timeFly;
    }

    public hotAirBalloon(double maxSpeed, String firm, double maxHeight, double timeFly) {
        super(maxSpeed, firm);
        this.maxHeight = maxHeight;
        this.timeFly = timeFly;
    }

    @Override
    void goFly() {
        System.out.println("На большом воздушном шарееее");
    }
}
