
class Human {
    private int age;// private - this particular variable which is age is accessible only in tha
                    // same class
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class encap {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Navin");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
