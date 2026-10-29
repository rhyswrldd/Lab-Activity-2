public class Truck extends Vehicle {

    private int wheelCount;

    public Truck(String manufacturer, String vehicleModel, int productionYear, int wheelCount) {
        super(manufacturer, vehicleModel, productionYear);
        this.wheelCount = wheelCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + wheelCount);
    }
}
