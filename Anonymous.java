
class A
{
    public A()
    {
        System.out.println ("object created"); 
    }
    public void show()
    {
        System.out.println ("in A show");
    }
}



public class Anonymous {
    public static void main(String[] args) {


        // A obj = new A();
        // obj.show();

        new A().show();; //anonymous object
    }
}
