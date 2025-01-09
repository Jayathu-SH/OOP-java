class Mobile {
    String brand;
    int price;
    static String name;

    // Constructor
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println ("In constructor");
    }

    // Static block
    static {
        name = "Phone";
        System.out.println ("In static block");
    }

    // Method to show mobile details
    public void show() {
        System.out.println (brand + ": " + price + " : " + name);
    }
}

public class block {
    public static void main(String[] args) {

        // Mobile obj1 = new Mobile(); // Calls constructor
        // obj1.brand = "Apple"; // Set brand
        // obj1.price = 1500; // Set price
        // Mobile.name = "Smart Phone"; // Update static variable

        // obj1.show(); // Call the show method to print details
    }
}
