abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car{
    // public void fly()
    // {
    //     System.out.println("Flying..");
    // }
    public void drive()
    {
        System.out.println("Driving..");
    }

}

class UpdateWagonR extends WagonR    //concrete claz
{

    
    public void fly() {
        System.out.println("Flying...");
    }

}

public class Abstractkey {
    public static void main(String[] args) {
        Car obj = new UpdateWagonR();//can make object from concrete claz
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
