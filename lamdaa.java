//functinalinterface code change as a lamda expression

@FunctionalInterface
interface A
{
    void show(int i);
   
    
}


public class lamdaa {
    public static void main(String[] args) {
        
        // A obj = (int i) -> System.out.println("in show " + i);
        A obj = i -> System.out.println("in show " + i);

        obj.show(5);
    }
}

    


