package section1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Person {
    private String name;
    private int age;
//    public static String nationality;
//    public final static String className = "Person";

    // Constructor 1
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor 2
    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

    public void sayHello() {
        System.out.println("Hi I'm " + this.name);
    }

    public static void main(String[] args) {
        Person a = new Person("ali", 2);
        Person b = new Person("ali", 2);
        Person c = new Person("ali", 2);
//        Person b = new Person(2);
//        a = b;
//        Person.className = "sadsad";
//        System.out.println(Person.className);
        Person ali = new Person("ali", 4);
        List<Person> people = new ArrayList<>();
        Queue<Person> queue = new ArrayDeque<>();
//        people.add(new Person(4));
//        people.remove(0);
//        people.remove(ali);



    }
}
