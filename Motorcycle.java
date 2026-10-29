public class Motorcycle extends Vehicle {

    private String transmissionType;

    public Motorcycle(String manufacturer, String vehicleModel, int productionYear,
                      String transmissionType) {
        super(manufacturer, vehicleModel, productionYear);
        this.transmissionType = transmissionType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Transmission Type: " + transmissionType);
    }
}
