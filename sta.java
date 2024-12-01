class Mobile 
{
    String brand; 
    int price;    
    static String name; 

    // Instance method
    public void show() 
    {
        System.out.println(brand + ": " + price + " : " + name);
    }

    // Static method
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + ": " + obj.price + " : " + name);
    }
}

public class sta {
    public static void main(String[] args)
    {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        
       
        Mobile.name = "Phone";

        
        obj1.show();
        obj2.show();

        // Call static method
        Mobile.show1(obj1);
    }
}
