package section1;

// Import other class that we need, here!

public class Person implements talking, moving {
    private String name;
    private int age;

    // Static & final Keyword
    public final static String className = "Person";

    // Constructor 1 : 'this' keyword point to current class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor 2 : 'this' keyword point to current class
    public Person(String name) {
        this.name = name;
    }

    // Sample Method for renaming person
    public void rename(String newName) {
        this.name = newName;
    }

    // + in String Meaning to Concatenation of substring
    @Override
    public String toString() {
        return "name: " + name;
    }

    // All Methods Below are defined in interfaces and Implementation's is here
    @Override
    public void sayHello() {
        System.out.println("Hi I'm " + name);
    }

    @Override
    public void saySomething(String something) {
        System.out.println(something);
    }

    @Override
    public void move(int dx) {
        System.out.println("I'm walking " + dx + " meters");
    }

    @Override
    public void run(int v) {
        System.out.println("I'm running " + v + " m/s");
    }
}
