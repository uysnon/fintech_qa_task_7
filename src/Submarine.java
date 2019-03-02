public class Submarine extends Maritime {
    double maxDeepUnderWater;

    public Submarine(double weight, double maxSpeed, String material, int maxPassengers, double maxDeepUnderWater) {
        super(weight, maxSpeed, material, maxPassengers);
        this.maxDeepUnderWater = maxDeepUnderWater;
    }

    @Override
    void feelingsAfterCruise() {
        System.out.println("А под водой было тоже ничего так");
    }
}
