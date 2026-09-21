public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Ducati";
        vehicle1.model = "Panigale V4";
        vehicle1.year = 2023;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Honda";
        vehicle2.model = "CBR900RR";
        vehicle2.year = 1996;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Kawasaki";
        vehicle3.model = "Ninja H2";
        vehicle3.year = 2018;

        System.out.println("Motorcycle 1:");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        System.out.println("Motorcycle 2:");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        System.out.println("Motorcycle 3:");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}