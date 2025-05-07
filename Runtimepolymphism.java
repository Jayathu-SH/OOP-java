


class A {// A has a child  B
     public void show()
     {
        System.out.println("in A show");
     }
}
class B extends A
{
    public void show()
     {
        System.out.println("in B show");
     }

}

class C extends A
{
    public void show()
     {
        System.out.println("in C show");
     }

}


public class Runtimepolymphism { // run time polymorphism 
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    //     Computer obj1 = new Laptop();           laptop extends computer 
    }
}
