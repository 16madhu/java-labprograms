public class Vehicle {
    private String make;
    private String model;
    private int year;

    
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Toyota", "Camry", 2022);
        myCar.displayDetails();
    }