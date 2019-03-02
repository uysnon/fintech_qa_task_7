public class Airplane extends AirVehicle {
    private double WingSize;
    private double length;
    private double weight;
    private double maxPassengers;

    public Airplane(double maxSpeed, String firm, double wingSize, double length, double weight, double maxPassengers) {
        super(maxSpeed, firm);
        WingSize = wingSize;
        this.length = length;
        this.weight = weight;
        this.maxPassengers = maxPassengers;
    }

    public void setWingSize(double wingSize) {
        WingSize = wingSize;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaxPassengers(double maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public double getWingSize() {
        return WingSize;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    void goFly() {
        System.out.println("clap-clap-clap фух, сели");
    }
}
