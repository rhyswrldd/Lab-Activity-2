public class Main {

    public static void showVehicle(Vehicle unit) {
        unit.displayInfo();
    }

    public static void main(String[] args) {

        Vehicle unit = new Car("Nissan", "GT-R", 2021, 2);
        unit.displayInfo();
        System.out.println();

        unit = new Motorcycle("Yamaha", "Mio Sporty", 2018, "Automatic");
        unit.displayInfo();
        System.out.println();

        unit = new Truck("Isuzu", "Elf", 2022, 6);
        unit.displayInfo();
        System.out.println();

        System.out.println("\n2. Using Method Parameters ");

        Car firstCar = new Car("Mazda", "MX-5", 2020, 2);
        Motorcycle firstBike = new Motorcycle("Kawasaki", "Ninja", 2023, "Manual");
        Truck firstTruck = new Truck("Hino", "300 Series", 2021, 4);

        showVehicle(firstCar);
        System.out.println();

        showVehicle(firstBike);
        System.out.println();

        showVehicle(firstTruck);
        System.out.println();

        System.out.println("\n 3. Using a Polymorphic Array ");

        Vehicle[] garage = {
            new Car("Subaru", "WRX", 2022, 4),
            new Motorcycle("Suzuki", "Burgman", 2021, "Automatic"),
            new Truck("Fuso", "Canter", 2019, 6)
        };

        for (Vehicle item : garage) {
            showVehicle(item);
            System.out.println();
        }
    }
}
