class A{
    public void show1()
    {
        System.out.println("in A show");

    }

}
class B extends A{
    public void show2()
    {
        System.out.println("in B show");

    }

}


public class Updowncast {
    public static void main(String[] args) {
        A obj =(A) new B(); //A is a superclass B is a sub class upcasting  B->A
        obj.show1();

        B obj1 =(B) obj;
        obj1.show2(); //downcasting


    }
}
