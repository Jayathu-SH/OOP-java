class A 
{

}

class B extends A 
{
    public B()
    {
        System.out.println ("in B");
    }

}

public class Super {
    public static void main (String[] args) {
        
        B obj = new B();
    }
}
