
class A
{
    int age; //variable

    public void show()//method
    {
        System.out.println("in show");

    }
    class B
    {
        public void config()
        {
            System.out.println("in config");
        }

    }
}


public class inner {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

    }
}
