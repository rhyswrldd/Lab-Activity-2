public class Car extends Vehicle {

    private int doorCount;

    public Car(String manufacturer, String vehicleModel, int productionYear, int doorCount) {
        super(manufacturer, vehicleModel, productionYear);
        this.doorCount = doorCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + doorCount);
    }
}
