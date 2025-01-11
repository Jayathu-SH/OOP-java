class Human {
    private int age; // private variable, accessible only within this class
    private String name;

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age; // Directly assign the value to the current object's age
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name; // Directly assign the value to the current object's name
    }
}

public class ThisKeywordExample {
    public static void main (String[] args) {
        Human obj = new Human();
        obj.setAge (30); // Set age to 30
        obj.setName ("Navin"); // Set name to "Navin"

        // Output the name and age
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
