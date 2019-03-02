public class Helicopter extends AirVehicle {

    private double rotorSize;
    private double weight;
    private double length;

    public void setRotorSize(double rotorSize) {
        this.rotorSize = rotorSize;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRotorSize() {
        return rotorSize;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public Helicopter(double maxSpeed, String firm, double rotorSize, double weight, double length) {
        super(maxSpeed, firm);
        this.rotorSize = rotorSize;
        this.weight = weight;
        this.length = length;
    }

    @Override
    void goFly() {
        System.out.println("Я на вертолете, жаль только не как в фильмах над ночным ЛА");
    }
}
