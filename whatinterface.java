interface A{ //interface means all the methods by default public abstract
    
    int age=33 ;        //final and static
    String area = "ganhela ";
    
    void show();
    void config();
}

class B implements A //implements for methods
{

    
    public void show() {
        System.out.println("in show");
    }

    
    public void config() {
        System.out.println("in config");
    }

}


public class whatinterface {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);
    }
}
