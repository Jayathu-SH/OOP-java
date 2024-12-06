class Human {
    private int age; 
    private String name;

  

    public Human(){      //default constructor
        age = 12;
        name = "John";
    }

    public Human(int a, String n) //parameterized constructor
    {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }
}

public class cons {
    public static void main (String[] args) 
    {


        Human obj = new Human();
        Human obj1 = new Human(18, "Navin");//passing values
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());


        // obj.setAge(30); 
        // obj.setName("Navin"); 

        //System.out.println(obj.getName() + " : " + obj.getAge());
    }

    

}
