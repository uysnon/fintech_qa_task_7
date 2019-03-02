public class CableCar extends AirVehicle {

    private Cable cable;

    @Override
    void goFly() {
        System.out.println("Ну я не совсем лечу, скорее ползу");
    }

    public void setCable(Cable cable) {
        this.cable = cable;
    }

    public void setCable(double length, double radius, double firm, double maxWeight) {
        this.cable = new Cable(length,radius,firm,maxWeight);
    }

    public Cable getCable() {
        return cable;
    }

    private class Cable{
        double length;
        double radius;
        double firm;
        double maxWeight;

        public Cable(double length, double radius, double firm, double maxWeight) {
            this.length = length;
            this.radius = radius;
            this.firm = firm;
            this.maxWeight = maxWeight;
        }

        public boolean isWeightNormal(double weight){
            if (weight + 50 < maxWeight) return true;
            return false;
        }
    }


}
