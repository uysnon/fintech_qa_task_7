public class Boat extends Maritime {
    double price;

    public Boat(double weight, double maxSpeed, String material, int maxPassengers, double price) {
        super(weight, maxSpeed, material, maxPassengers);
        this.price = price;
    }

    @Override
    void feelingsAfterCruise() {
        System.out.println("ОГО, наконецто земля!");
    }
}
