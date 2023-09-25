package project2;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(25000, "Blue", 22);
        Truck truck = new Truck(35000, "Red", 2500);

        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());
    }
}
