
public class Vehicle {

    String manufacturer;
    String vehicleModel;
    int productionYear;

    public Vehicle(String manufacturer, String vehicleModel, int productionYear) {
        this.manufacturer = manufacturer;
        this.vehicleModel = vehicleModel;
        this.productionYear = productionYear;
    }

    public void displayInfo() {
        System.out.println("Brand: " + manufacturer
                + ", Model: " + vehicleModel
                + ", Year: " + productionYear);
    }
}
